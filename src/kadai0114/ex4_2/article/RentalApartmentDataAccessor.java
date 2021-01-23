package kadai0114.ex4_2.article;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kadai0114.commons.utility.csv.CSVFileReader;
import kadai0114.commons.utility.csv.CSVFileWriter;

/**
 * 賃貸アパートのデータ入出力を管理するクラス
 *
 * <pre>
 *
 * 賃貸アパートのデータ永続化に関する入出力の操作を保有します.
 *
 * 賃貸アパートのデータを読み込む {@link #load(RentalApartment[]) load}メソッドと
 * 賃貸アパートのデータを保存する {@link #save(RentalApartment[]) save}メソッドを提供します.
 *
 * 賃貸アパートは、csv(Comma Separated Values)形式でファイルに対して読み込み・保存を行います.
 *
 * csvファイルの形式を以下に示します。
 *
 * 1列目:物件名称
 * 2列目:部屋番号
 * 3列目:月々の賃料
 * 4列目:敷金
 * 5列目:礼金
 *
 * --------------------------------------
 * 物件名称,部屋番号,月々の賃料,敷金,礼金
 * 物件名称,部屋番号,月々の賃料,敷金,礼金
 *    ：   ,    ：  ,    ：    , ： , ;
 * --------------------------------------
 *
 * 使用例を以下に示します。
 *
 * apartment.csvファイルの内容
 * --------------------------------------
 * エステートピア新宿,105,84000,2.0,1.0
 * ハイツ原宿,201,72000,1.0,0.5
 * ローアール渋谷,507,108000,2.0,2.0
 * --------------------------------------
 *
 * // 賃貸アパートデータを格納する配列を準備します
 * RentalApartment[] apartments = new RentalApartment[10];
 *
 * try {
 *     // 賃貸アパートデータを読み込みます
 *     // loadメソッドの引数には、準備した配列を指定します
 *     int apartmentCount = RentalApartmentDataAccessor.load(apartments);
 *
 *     // 賃貸アパートデータを配列に１件追加します
 *     apartments[3] = new RentalApartment("ヒルサイド恵比寿",302,93000, 2.0, 1.0);
 *
 *     // 賃貸アパートデータを保存します
 *     RentalApartmentDataAccessor.save(employees);
 * } catch (IOException e) {
 *     System.out.println(&quot;賃貸アパートデータの読み込み又は保存に失敗しました&quot;);
 * }
 *
 * 保存後の apartment.csvファイルの内容
 * --------------------------------------
 * エステートピア新宿,105,84000,2.0,1.0
 * ハイツ原宿,201,72000,1.0,0.5
 * ローアール渋谷,507,108000,2.0,2.0
 * ヒルサイド恵比寿,302,93000,2.0,1.0
 * --------------------------------------
 *
 * </pre>
 *
 * @author BetterOneself
 */
public class RentalApartmentDataAccessor {

    /**
     * 賃貸アパートデータの読み書きに使用するファイル・パス
     */
    private static final String FILE_PATH = "../apartment.csv";

    /**
     * 賃貸アパートデータを読み込みます.
     *
     * <pre>
     * 賃貸アパートデータは、csvファイルから読み込み、引数に指定した配列に賃貸アパートインスタンスとして格納します.
     *
     * 格納先配列に賃貸アパートインスタンスの存在確認は行わずに上書で格納します.
     *
     * 賃貸アパートデータの読み込みは、csvファイルの終端に達するか、引数に指定した配列に収まる範囲で行います。
     *
     * </pre>
     *
     * @param apartments
     *            読み込んだ賃貸アパートデータを格納する配列
     * @return 読み込んだ賃貸アパートデータの件数
     * @throws IOException
     *             csvファイルの読み込みに失敗した場合
     */
    public static int load(RentalApartment[] apartments) throws IOException {
        CSVFileReader reader = new CSVFileReader(FILE_PATH);
        List<String[]> columnsList = reader.read();

        int dataCount = 0;
        for (int i = 0; i < columnsList.size(); i++) {
            String[] columns = columnsList.get(i);
            apartments[i] = createRentalApartment(columns);
            dataCount++;
            if (i >= apartments.length - 1) {
                break;
            }
        }
        return dataCount;
    }

    /**
     * カラム(列データ)文字列配列からRentalApartmentインスタンスを生成します.
     *
     * @param columns
     *            カラム(列データ)文字列配列
     * @return 生成されたRentalApartmentインスタンス
     */
    private static RentalApartment createRentalApartment(String[] columns) {

        return new RentalApartment(columns[0], Integer.parseInt(columns[1]), Integer
                .parseInt(columns[2]), Double.parseDouble(columns[3]), Double.parseDouble(columns[4]));
    }

    /**
     * 賃貸アパートデータを保存します。
     *
     * @param apartments
     *            保存する賃貸アパートデータの配列
     * @throws IOException
     *             csvファイルへの書き込みに失敗した場合
     */
    public static void save(RentalApartment[] apartments) throws IOException {
        List<String[]> columnsList = new ArrayList<String[]>();
        for (RentalApartment employee : apartments) {
            if (employee == null) {
                continue;
            }
            columnsList.add(createColumns(employee));
        }

        CSVFileWriter writer = new CSVFileWriter(FILE_PATH);
        writer.overwrite(columnsList);
    }

    /**
     * RentalApartmentインスタンスからカラム(列データ)文字列配列を作成します。
     *
     * @param apartment
     *            対象のRentalApartmentインスタンス
     * @return カラム(列データ)文字列配列
     */
    private static String[] createColumns(RentalApartment apartment) {
        String[] columns = { apartment.getName(),
                String.valueOf(apartment.getNumber()),
                String.valueOf(apartment.getPrice()),
                String.valueOf(apartment.getDeposit()),
                String.valueOf(apartment.getKeyMoney())
                };
        return columns;
    }
}
