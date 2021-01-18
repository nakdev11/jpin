package kadai0114.commons.utility.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CSV�t�@�C���̓Ǎ��݂��s���܂�.
 *
 * ���̃N���X���p�������T�u�N���X����邱�Ƃ͂ł��܂���.
 *
 * @author BetterOneself
 */
public final class CSVFileReader {

    /** CSV�t�@�C���̃J���}���� */
    private static final String COMMA_STRING = ",";

    /** CSV�t�@�C���̃t�@�C�� */
    private File csvFile = null;

    /** CSV�t�@�C����ǂݍ��ނ��߂�Reader */
    private BufferedReader reader = null;

    /** �N�H�[�e�[�V���������̉� */
    private boolean quoteRemoving = false;

    /**
     * �����ΏۂƂȂ�N�H�[�e�[�V�����̏W�� �f�t�H���g�l�F�u"�v�u'�v
     */
    private char[] quoteChars = { '\'', '"' };

    /**
     * �R���X�g���N�^.
     *
     * �w�肳�ꂽ�p�X�����ɁAFile�C���X�^���X�𐶐����ĕێ����܂�.
     *
     * @param path
     *            �Ǎ��ݑΏۂ̃t�@�C���ւ̃p�X
     * @throws FileNotFoundException
     *             �w�肳�ꂽ�t�@�C����������Ȃ��ꍇ
     */
    public CSVFileReader(String path) throws FileNotFoundException {
        csvFile = new File(path);
    }

    /**
     * �J������ǂݍ��݂܂�.
     *
     * @return �J�����Q�̃��X�g
     * @throws java.io.IOException
     *             �ǂݍ��݂Ɏ��s�����ꍇ
     */
    public List<String[]> read() throws IOException {
        List<String[]> columnsList = null;
        try {
            initReader();
            columnsList = readFromCsv();
        } finally {
            closeReaderQuietly();
        }
        return columnsList;
    }

    /**
     * Reader�����������܂�.
     *
     * @throws IOException
     *             Reader�̏������Ɏ��s�����ꍇ
     */
    private void initReader() throws IOException {
        reader = new BufferedReader(new FileReader(csvFile));
    }

    /**
     * Reader����܂�.
     *
     * ����ۂɗ�O�����������ꍇ�ł��A��O�𓊂��܂���.
     * �{���͗�O���O���o�͂���悤�Ɏ������܂��B
     */
    private void closeReaderQuietly() {
        if (reader == null) {
            return;
        }

        try {
            reader.close();
        } catch (IOException e) {
            // �{���͂����ŁA��O���O�����o�͂��ׂ��ł�.
            // �{���K�ł͉������������{���܂���.
        } finally {
            reader = null;
        }
    }

    /**
     * Reader���g�p���ăt�@�C����ǂݍ��݂Ȃ���J������List���쐬���܂�.
     *
     * @return �J������List
     * @throws IOException
     *             �s�̓ǂݎ��Ɏ��s�����ꍇ
     */
    private List<String[]> readFromCsv() throws IOException {
        // �J������List��������
        List<String[]> columnsList = new ArrayList<String[]>();

        String line = null;
        // �t�@�C������s��ǂݎ��Ȃ���J�����̕�����z����쐬
        while ((line = reader.readLine()) != null) {
            String[] columns = makeColumnArray(line);
            columnsList.add(columns);
        }
        return columnsList;
    }

    /**
     * �w�肳�ꂽ�J���}��؂蕶������J�����̕�����z��ɕϊ����܂�.
     *
     * @param line
     *            �J���}��؂蕶����
     * @return �J�����̕�����z��
     */
    private String[] makeColumnArray(String line) {
        // ���蕶�����폜����ݒ�̏ꍇ�A�폜�����{����
        if (quoteRemoving) {
            line = removeQuoteChar(line);
        }
        // String#split���g�p���āA�J���}��؂蕶����𕶎���z��ɕϊ�
        return line.split(COMMA_STRING);
    }

    /**
     * �����̕����񂩂犇�蕶�����������������Ԃ��܂�.
     *
     * �ݒ肳��Ă��銇�蕶��������������̐擪�Ɩ����̑o���� ���݂��Ȃ��ꍇ�A���̕������Ԃ��܂�.
     *
     * @param source
     *            ���蕶���폜�Ώۂ̕�����
     * @return ���蕶������������������
     */
    private String removeQuoteChar(String source) {
        for (char quote : quoteChars) {
            source = source.replaceAll(Character.toString(quote), "");
        }
        return source;
    }

    // ==================================
    // CSVFileReader�̋����ݒ胁�\�b�h�Q
    // ==================================

    /**
     * ���蕶�����폜���邩�ݒ肵�܂�.
     *
     * �f�t�H���g�ł͍폜���Ȃ��ݒ�ƂȂ�܂�.
     *
     * @param isRemoved
     *            <code>true</code>:�폜����A<code>false</code>:�폜���Ȃ�
     */
    public void setQuoteRemoving(boolean isRemoved) {
        quoteRemoving = isRemoved;
    }

    /**
     * �폜���銇�蕶����ݒ肵�܂�.
     *
     * <code>null</code>���w�肵���ꍇ�A�폜�͎��{����܂���.
     *
     * @param strs
     *            ���蕶���̏W��
     */
    public void setQuoteChars(char[] strs) {
        if (strs == null) {
            quoteChars = new char[0];
            return;
        }
        quoteChars = strs;
    }

    /**
     * �폜���銇�蕶����ݒ肵�܂�.
     *
     * <code>null</code>���w�肵���ꍇ�A�폜�͎��{����܂���.
     *
     * @param str
     *            ���蕶���̏W��
     */
    public void setQuoteChars(String str) {
        if (str == null) {
            quoteChars = new char[0];
            return;
        }
        quoteChars = str.toCharArray();
    }
}
