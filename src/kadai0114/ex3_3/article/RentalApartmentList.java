package kadai0114.ex3_3.article;

/**
 * 賃貸アパートの集合を管理するクラス

 * <pre>
 * 賃貸アパートを複数まとめて管理します.
 * 賃貸アパートを追加する操作や追加済みの賃貸アパートを取得する
 * 操作を保有しています.
 *
 * RentalApartmentList.java
 *
 * </pre>
 *
 * @author BetterOneself
 */
public class RentalApartmentList {

    /**
     * 追加できる賃貸アパートの最大数
     *
     * 追加できる部屋数は、最大 50
     */
    public static final int MAX_QUANTITY = 50;

    /**
     * 賃貸アパートの配列
     */
    RentalApartment[] apartments = new RentalApartment[MAX_QUANTITY];

    /**
     * 追加登録されている賃貸アパートの数量
     */
    private int quantityCount = 0;

    /**
     * 賃貸アパートリストに賃貸アパートインスタンスを追加します.
     *
     * @param apartment 追加対象の賃貸アパートインスタンス
     */
    public void addRentalApartment(RentalApartment apartment) {
        // 登録されている賃貸アパートの数が登録可能最大数未満の場合
        // 賃貸アパートを追加する
        if(quantityCount < apartments.length) {
            apartments[quantityCount] = apartment;
            quantityCount++;
        }
    }

    /**
     * 指定されたインデックスの賃貸アパートインスタンスを取得します.
     *
     * <pre>
     * 指定されたインデックスが以下の場合は、null を返却します.
     * 　インデックスが 0 未満
     * 　インデックスが 登録済み賃貸アパート数以上
     * </pre>
     *
     * @param index インデックス数(開始は 0)
     * @return 指定されたインデックスの賃貸アパートインスタンス
     */
    public RentalApartment getRentalApartment(int index) {
        // 引数で指定されたインデックスが
        // 0 〜 (登録されている賃貸アパート数 - 1)の範囲にある場合
        // 賃貸アパートを返却します.
        if(0 <= index && index < quantityCount) {
            return apartments[index];
        }
        return null;
    }

    /**
     * 登録されている賃貸アパートの数量を取得します.
     *
     * @return 登録されている賃貸アパートの数量
     */
    public int getQuantityCount() {
        return quantityCount;
    }

}
