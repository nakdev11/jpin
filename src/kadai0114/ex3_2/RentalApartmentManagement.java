package kadai0114.ex3_2;

import kadai0114.commons.utility.StandardInputReader;
import kadai0114.ex3_2.article.RentalApartment;
import kadai0114.ex3_2.article.RentalApartmentList;


/**
 * 賃貸アパートを管理するためのアプリケーションです.
 *
 * @author BetterOneself
 */
class RentalApartmentManagement {

    /**
     * アプリケーションを起動します.
     *
     * @param args 起動パラメータ文字列の配列(今回は利用しない)
     */
    public static void main(String[] args) {

    	// 賃貸アパートインスタンスを格納するリスト
    	RentalApartmentList apartmentList = new RentalApartmentList();

        // リストの最大数量まで繰り返す
        for (int i = 0; i < RentalApartmentList.MAX_QUANTITY; i++) {
            // コンソールから賃貸アパートのデータを入力する
            String name = StandardInputReader.getInputString("アパート名称を入力してください:");
            // アパート名称に空文字が入力された場合、繰り返しを終了する
            if (name.length() == 0) {
            	break;
            }
            int number = StandardInputReader.getInputInt("部屋番号を入力してください:");
            int price = StandardInputReader.getInputInt("賃料を入力してください:");
            double deposit = StandardInputReader.getInputDouble("敷金を入力してください:");
            double keyMoney = StandardInputReader.getInputDouble("礼金を入力してください:");

            // 改行する
            System.out.println();

            // 賃貸アパートインスタンスの生成し、リストに追加する
            apartmentList.addRentalApartment(new RentalApartment(name, number, price, deposit, keyMoney));
        }

        for (int i = 0; i < apartmentList.getQuantityCount(); i++) {
        	RentalApartment apartment = apartmentList.getRentalApartment(i);
            // 賃貸アパートインスタンスからデータを取得する
            String name = apartment.getName();
            int number = apartment.getNumber();
            int price = apartment.getPrice();
            double deposit = apartment.getDeposit();
            double keyMoney = apartment.getKeyMoney();

            int initalCost = apartment.calcInitalCost();

            // 賃貸アパートのデータを表示する
            System.out.println("名称:" + name + " " + number + "号室"
                    + " 賃料:" + price + "円"
                    + " 敷金:" + deposit + "ヶ月"
                    + " 礼金:" + keyMoney + "ヶ月"
                    + " 初期費用:" + initalCost + "円");
        }
        // 改行する
        System.out.println();

    }

}
