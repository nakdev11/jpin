package kadai210114.ex3_3.article;
/**
 * 賃貸アパートを表すクラス
 *
 * 賃貸アパートに関わる情報や操作を保有します.
 *
 * RentalApartment.java
 *
 * @author BetterOneself
 */
public class RentalApartment {

    /**
     * 物件名称
     */
    private String name;

    /**
     * 部屋番号
     */
    private int number;

    /**
     * 月々の賃料
     */
    private int price;

    /**
     * 敷金(賃料の何ヶ月分)
     */
    private double deposit;

    /**
     * 礼金(賃料の何ヶ月分)
     */
    double keyMoney;


    /**
     * 賃貸アパートを表すクラスのコンストラクタです.
     *
     * 引数で渡した値をもとに属性を初期化します.
     *
     * @param name 物件名称
     * @param number 部屋番号
     * @param price 月々の賃料
     * @param deposit 敷金(賃料の何ヶ月分)
     * @param keyMoney 礼金(賃料の何ヶ月分)
     */
    public RentalApartment(String name, int number, int price, double deposit, double keyMoney) {
        this.name = name;
        this.number = number;
        this.price = price;
        this.deposit = deposit;
        this.keyMoney = keyMoney;
    }

    /**
     * 物件名称を取得します.
     *
     * @return 物件名称
     */
    public String getName() {
        return name;
    }

    /**
     * 物件名称を設定します.
     *
     * @param name
     *            物件名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 部屋番号を取得します.
     *
     * @return 部屋番号
     */
    public int getNumber() {
        return number;
    }

    /**
     * 部屋番号を設定します.
     *
     * @param number
     *            部屋番号
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * 月々の賃料を取得します.
     *
     * @return 月々の賃料
     */
    public int getPrice() {
        return price;
    }

    /**
     * 月々の賃料を設定します.
     *
     * @param price 月々の賃料
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 敷金を取得します.
     *
     * @return 敷金(賃料の何ヶ月分)
     */
    public double getDeposit() {
        return deposit;
    }

    /**
     * 敷金を設定します.
     *
     * @param deposit
     *            敷金(賃料の何ヶ月分)
     */
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    /**
     * 礼金を取得します.
     *
     * @return 礼金(賃料の何ヶ月分)
     */
    public double getKeyMoney() {
        return keyMoney;
    }

    /**
     * 礼金を設定します.
     *
     * @param keyMoney
     *            礼金(賃料の何ヶ月分)
     */
    public void setKeyMoney(double keyMoney) {
        this.keyMoney = keyMoney;
    }

    /**
     * 契約時の初期費用を計算します.
     * <pre>
     * 計算式は以下の通り
     *
     * 　賃料の前払い分＋敷金＋礼金＋仲介手数料
     *
     * 　賃料の前払い分＝　賃料×２
     * 　敷金　　　　　＝　賃料×敷金の月数
     * 　礼金　　　　　＝　賃料×礼金の月数
     *
     * 　仲介手数料は以下のルールで決定されます
     *
     * 　　賃料が 50,000円未満の場合は、賃料の 1ヶ月分
     *
     * 　　賃料が 50,000円以上 100,000円未満の場合は、賃料の 0.75ヶ月分
     *
     * 　　賃料が 100,000円以上の場合は、賃料の 0.5ヶ月分
     *
     * 注意
     * 　敷金、礼金、仲介手数料は、小数点以下を切り捨てます.
     *
     * </pre>
     *
     * @return 初期費用
     */
    public int calcInitalCost() {
        int paymentFee = price * 2 ;
        double depositFee = price * deposit;
        double keyMoneyFee = price * keyMoney;

        double agentFee = 0.0;
        if (price < 50000) {
            agentFee = price * 1;
        } else if (price < 100000) {
            agentFee = price * 0.75;
        } else {
            agentFee = price * 0.5;
        }

        int initalCost = paymentFee + (int)depositFee + (int)keyMoneyFee + (int)agentFee;

        return initalCost;
    }

}
