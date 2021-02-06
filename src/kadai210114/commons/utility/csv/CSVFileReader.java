package kadai210114.commons.utility.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CSVファイルの読込みを行います.
 * 
 * このクラスを継承したサブクラスを作ることはできません.
 * 
 * @author BetterOneself
 */
public final class CSVFileReader {

    /** CSVファイルのカンマ文字 */
    private static final String COMMA_STRING = ",";

    /** CSVファイルのファイル */
    private File csvFile = null;

    /** CSVファイルを読み込むためのReader */
    private BufferedReader reader = null;

    /** クォーテーション除去の可否 */
    private boolean quoteRemoving = false;

    /**
     * 除去対象となるクォーテーションの集合 デフォルト値：「"」「'」
     */
    private char[] quoteChars = { '\'', '"' };

    /**
     * コンストラクタ.
     * 
     * 指定されたパスを元に、Fileインスタンスを生成して保持します.
     * 
     * @param path
     *            読込み対象のファイルへのパス
     * @throws FileNotFoundException
     *             指定されたファイルが見つからない場合
     */
    public CSVFileReader(String path) throws FileNotFoundException {
        csvFile = new File(path);
    }

    /**
     * カラムを読み込みます.
     * 
     * @return カラム群のリスト
     * @throws java.io.IOException
     *             読み込みに失敗した場合
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
     * Readerを初期化します.
     * 
     * @throws IOException
     *             Readerの初期化に失敗した場合
     */
    private void initReader() throws IOException {
        reader = new BufferedReader(new FileReader(csvFile));
    }

    /**
     * Readerを閉じます.
     * 
     * 閉じる際に例外が発生した場合でも、例外を投げません.
     * 本来は例外ログを出力するように実装します。
     */
    private void closeReaderQuietly() {
        if (reader == null) {
            return;
        }

        try {
            reader.close();
        } catch (IOException e) {
            // 本来はここで、例外ログ等を出力すべきです.
            // 本演習では何も処理を実施しません.
        } finally {
            reader = null;
        }
    }

    /**
     * Readerを使用してファイルを読み込みながらカラムのListを作成します.
     * 
     * @return カラムのList
     * @throws IOException
     *             行の読み取りに失敗した場合
     */
    private List<String[]> readFromCsv() throws IOException {
        // カラムのListを初期化
        List<String[]> columnsList = new ArrayList<String[]>();

        String line = null;
        // ファイルから行を読み取りながらカラムの文字列配列を作成
        while ((line = reader.readLine()) != null) {
            String[] columns = makeColumnArray(line);
            columnsList.add(columns);
        }
        return columnsList;
    }

    /**
     * 指定されたカンマ区切り文字列をカラムの文字列配列に変換します.
     * 
     * @param line
     *            カンマ区切り文字列
     * @return カラムの文字列配列
     */
    private String[] makeColumnArray(String line) {
        // 括り文字を削除する設定の場合、削除を実施する
        if (quoteRemoving) {
            line = removeQuoteChar(line);
        }
        // String#splitを使用して、カンマ区切り文字列を文字列配列に変換
        return line.split(COMMA_STRING);
    }

    /**
     * 引数の文字列から括り文字を除いた文字列を返します.
     * 
     * 設定されている括り文字が引数文字列の先頭と末尾の双方に 存在しない場合、元の文字列を返します.
     * 
     * @param source
     *            括り文字削除対象の文字列
     * @return 括り文字を除去した文字列
     */
    private String removeQuoteChar(String source) {
        for (char quote : quoteChars) {
            source = source.replaceAll(Character.toString(quote), "");
        }
        return source;
    }

    // ==================================
    // CSVFileReaderの挙動設定メソッド群
    // ==================================

    /**
     * 括り文字を削除するか設定します.
     * 
     * デフォルトでは削除しない設定となります.
     * 
     * @param isRemoved
     *            <code>true</code>:削除する、<code>false</code>:削除しない
     */
    public void setQuoteRemoving(boolean isRemoved) {
        quoteRemoving = isRemoved;
    }

    /**
     * 削除する括り文字を設定します.
     * 
     * <code>null</code>を指定した場合、削除は実施されません.
     * 
     * @param strs
     *            括り文字の集合
     */
    public void setQuoteChars(char[] strs) {
        if (strs == null) {
            quoteChars = new char[0];
            return;
        }
        quoteChars = strs;
    }

    /**
     * 削除する括り文字を設定します.
     * 
     * <code>null</code>を指定した場合、削除は実施されません.
     * 
     * @param str
     *            括り文字の集合
     */
    public void setQuoteChars(String str) {
        if (str == null) {
            quoteChars = new char[0];
            return;
        }
        quoteChars = str.toCharArray();
    }
}
