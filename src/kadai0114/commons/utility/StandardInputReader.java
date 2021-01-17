package kadai0114.commons.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * StandardInputReader�N���X�́A�W������(�R���\�[��)������͂��ꂽ�f�[�^���擾���邽�߂̋@�\��L���܂�.
 *
 * <pre>
 *  �R���\�[���œ��͂��ꂽ�f�[�^�𕶎���f�[�^�Ƃ��Ď擾����ꍇ�́A{@link #getInputString(String)} ���\�b�h���g�p���܂�.
 *
 *  �g�p�� :
 * <code>
 * String stringData = StandardInputReader.getInputString(&quot;���������͂��ĉ������F&quot;);
 * </code>
 *
 *  �R���\�[��������͂��ꂽ�f�[�^�𐔒l�f�[�^�Ƃ��Ď擾����ꍇ�́A{@link #getInputInt(String)} ���\�b�h���g�p���܂�.
 *
 *  �g�p�� :
 * <code>
 * int intData = StandardInputReader.getInputInt(&quot;���l����͂��ĉ������F&quot;);
 * </code>
 *
 * </pre>
 *
 *  @author BetterOneself
 */
public class StandardInputReader {

    /**
     * �R���\�[��������͂����f�[�^�� �����f�[�^�Ƃ��Ď擾���܂�.
     *
     * @param message
     *            �\�����郁�b�Z�[�W
     * @return ���[�U�̓��͂��������f�[�^. ���������͂���Ȃ������ꍇ�A����0�̕����񂪕ԋp����܂�.
     */
    public static String getInputString(String message) {
        System.out.print(message);
        String inputString = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));
        try {
            inputString = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("���͎��ɃG���[���������܂����B", e);
        }
        return inputString;
    }

    /**
     * �R���\�[��������͂����f�[�^�� ���l(����)�f�[�^�Ƃ��Ď擾���܂�.
     *
     * @param message
     *            �\�����郁�b�Z�[�W
     * @return ���[�U�̓��͂������l(����)�f�[�^
     * @throws NumberFormatException
     *             �����ɕϊ��ł��Ȃ����������͂��ꂽ�ꍇ
     */
    public static int getInputInt(String message) throws NumberFormatException {
        return Integer.parseInt(getInputString(message));
    }

    /**
     * �R���\�[��������͂����f�[�^�� ���l(����)�f�[�^�Ƃ��Ď擾���܂�.
     *
     * @param message
     *            �\�����郁�b�Z�[�W
     * @return ���[�U�̓��͂������l(����)�f�[�^
     * @throws NumberFormatException
     *             �����ɕϊ��ł��Ȃ����������͂��ꂽ�ꍇ
     */
    public static double getInputDouble(String message) throws NumberFormatException {
        return Double.parseDouble(getInputString(message));
    }
}