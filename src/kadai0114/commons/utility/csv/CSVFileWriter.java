package kadai0114.commons.utility.csv;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * CSV�t�@�C�����������ޕ����X�g���[���N���X�ł�.
 *
 * @author BetterOneself
 */
public final class CSVFileWriter {

    /** CSV�t�@�C���̃J���}���� */
    private static final String COMMA_STRING = ",";

    /** CSV�t�@�C���̃t�@�C�� */
    private File csvFile = null;

    /** CSV�t�@�C�����������ނ��߂�Writer */
    private BufferedWriter writer = null;

    /** �N�H�[�e�[�V�����ǉ��̉� */
    private boolean quoteAdding = false;

    /** �N�H�[�e�[�V���� */
    private char quoteChar = '"';

    /**
     * �R���X�g���N�^.
     *
     * �w�肳�ꂽ�p�X�����ɁAFile�I�u�W�F�N�g���쐬���ĕێ����܂�.
     *
     * @param path
     *            �Ǎ��ݑΏۂ̃t�@�C���ւ̃p�X
     * @throws FileNotFoundException
     *             �w�肳�ꂽ�t�@�C����������Ȃ��ꍇ
     */
    public CSVFileWriter(String path) throws FileNotFoundException {
        csvFile = new File(path);
    }

    /**
     * �J�����̓��e��CSV���㏑�����܂�.
     *
     * @param columnsList
     *            �������ރJ������List
     * @throws java.io.IOException
     *             �㏑���Ɏ��s�����ꍇ
     */
    public void overwrite(List<String[]> columnsList) throws IOException {
        try {
            initWriter(false);
            writeToCsv(columnsList);
            flush();
        } finally {
            closeQuietly();
        }
    }

    /**
     * �J�����̓��e��CSV�ɒǋL���܂�.
     *
     * @param columns
     *            �ǋL����J����
     * @throws IOException
     *             �ǋL�Ɏ��s�����ꍇ
     */
    public void append(String[] columns) throws IOException {
        try {
            initWriter(true);
            writeToCsv(columns);
            flush();
        } finally {
            closeQuietly();
        }
    }

    /**
     * Writer�����������܂�.
     *
     * @throws IOException
     *             Writer�̏������Ɏ��s�����ꍇ
     */
    private void initWriter(boolean append) throws IOException {
        writer = new BufferedWriter(new FileWriter(csvFile, append));
    }

    /**
     * Writer��flush���܂�.
     *
     * @throws IOException
     *             flush�Ɏ��s�����ꍇ
     */
    private void flush() throws IOException {
        writer.flush();
    }

    /**
     * Writer����܂�.
     *
     * ����ۂɗ�O�����������ꍇ�ł��A��O�𓊂��܂���B�{���͗�O���O���o�͂���悤�Ɏ������܂�.
     */
    private void closeQuietly() {
        if (writer == null) {
            return;
        }

        try {
            writer.close();
        } catch (IOException e) {
            // �{���͂����ŁA��O���O�����o�͂��ׂ��ł�.
            // �{���K�ł͉������������{���܂���.
        } finally {
            writer = null;
        }
    }

    /**
     * Writer���g�p���ăJ������List��CSV�t�@�C���ɏ������݂܂�.
     *
     * @param �J������
     *            List
     * @throws IOException
     *             CSV�t�@�C���ւ̏������݂Ɏ��s�����ꍇ
     */
    private void writeToCsv(List<String[]> columnsList) throws IOException {
        // �w�肳�ꂽ������z��List�����ɓǂݍ��݁A�J���}��؂蕶������쐬
        for (String[] columns : columnsList) {
            writeToCsv(columns);
        }
    }

    /**
     * Writer���g�p���ăJ������CSV�t�@�C���ɏ������݂܂�.
     *
     * @param columns
     *            �J����
     * @throws IOException
     *             CSV�t�@�C���ւ̏������݂Ɏ��s�����ꍇ
     */
    private void writeToCsv(String[] columns) throws IOException {
        // �J���}��؂蕶����ɕϊ�
        String line = makeLine(columns);
        // �쐬�������������������
        writer.write(line);
        // ���s�R�[�h����������
        writer.newLine();
    }

    /**
     * ������z����A�J���}��؂�̕�����ɕϊ����܂�.
     *
     * @param columns
     *            ������z��
     * @return �J���}��؂�̕�����
     */
    private String makeLine(String[] columns) {
        // �w�肳�ꂽ�����񂪋�z��̏ꍇ�A���當�����Ԃ�
        if (columns.length == 0) {
            return "";
        }

        // StringBuffer���쐬���A�J���}��؂蕶�������������
        StringBuffer lineSb = new StringBuffer();
        for (int i = 0; i < columns.length - 1; i++) {
            // 1�̕�������������ށi�K�v�ł���΃N�H�[�e�[�V������ݒ�j
            lineSb.append(makeQuoteLineIfRequired(columns[i]));
            // �J���}��������������
            lineSb.append(COMMA_STRING);
        }
        // �Ō�̕��������������
        lineSb.append(makeQuoteLineIfRequired(columns[columns.length - 1]));
        return lineSb.toString();
    }

    /**
     * �K�v�ɉ����ăN�H�[�e�[�V������ݒ肷��.
     *
     * ��̓I�ɂ́A<code>quoteAdding</code>��<code>true</code>�̏ꍇ�A�N�H�[�e�[�V�������������݂܂�.
     *
     * @param column
     *            ������
     * @return �N�H�[�e�[�V�����t��������
     */
    private String makeQuoteLineIfRequired(String column) {
        if (!quoteAdding) {
            return column;
        }
        return quoteChar + column + quoteChar;
    }

    // ==================================
    // CSVFileWriter�̋����ݒ胁�\�b�h�Q
    // ==================================

    /**
     * �o�͂����e�J���������邩�ۂ��w�肵�܂�.
     *
     * �f�t�H���g�̊��蕶���� "(�_�u���N�H�[�e�[�V����)�ł�
     *
     * @param isAdded
     *            <code>true</code>:���� <code>false</code>:����Ȃ�
     * @see #setQuoteChar
     */
    public void setQuoteAdding(boolean isAdded) {
        quoteAdding = isAdded;
    }

    /**
     * �e�J���������镶�����w�肵�܂�.
     *
     * �f�t�H���g�̊��蕶���� "(�_�u���N�H�[�e�[�V����)�ł�
     *
     * @param quoteChar
     *            ���蕶��
     */
    public void setQuoteChar(char quoteChar) {
        this.quoteChar = quoteChar;
    }
}
