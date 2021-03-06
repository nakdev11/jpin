package kadai210114.ex4_2;

import kadai210114.commons.utility.StandardInputReader;
import kadai210114.ex4_2.article.RentalApartment;
import kadai210114.ex4_2.article.RentalApartmentList;


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

    	// 1.1
    	RentalApartmentList apartmentList = new RentalApartmentList();
    	// 1.2
    	boolean successful = loadRentalApartment(apartmentList);

    	if (successful) {
    		// 1.3 リストの情報を表示
    		displayRentalApartment(apartmentList);
    		// 1.4 賃貸アパートインスタンスをリストへ格納
    		registerRentalApartment(apartmentList);
    		// 1.3 リストの情報を表示
    		displayRentalApartment(apartmentList);
    	}

    }

    private static void registerRentalApartment(RentalApartmentList apartmentList) {

    	// リストの最大数量まで繰り返す
    	for (int i = 0; i < RentalApartmentList.MAX_QUANTITY; i++) {
    		// コンソールから賃貸アパートのデータを入力する
    		String name = StandardInputReader.getInputString("アパート名称を入力してください:");
    		// アパート名称に空文字が入力された場合、繰り返しを終了する
    		if (name.length() == 0) {
    			break;
    		}
    		try {
    			int number = StandardInputReader.getInputInt("部屋番号を入力してください:");
    			int price = StandardInputReader.getInputInt("賃料を入力してください:");
    			double deposit = StandardInputReader.getInputDouble("敷金を入力してください:");
    			double keyMoney = StandardInputReader.getInputDouble("礼金を入力してください:");

    			// 改行する
    			System.out.println();

    			// 賃貸アパートインスタンスの生成し、リストに追加する
    			apartmentList.addRentalApartment(new RentalApartment(name, number, price, deposit, keyMoney));

    		} catch (NumberFormatException e) {
    			System.out.println("数値を入力してください");
    			System.out.println();
    		}
    	}
    }

    private static void displayRentalApartment(RentalApartmentList apartmentList) {
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

    private static boolean loadRentalApartment(RentalApartmentList apartmentList) {
    	// 1.2.1
    	boolean isLoaded = apartmentList.loadRentalApartment();
    	if (isLoaded) {
        	// 1.2.2
    		System.out.println("賃貸アパートデータの読み込みに成功しました");
    	} else {
    		// 1.2.3
    		System.out.println("賃貸アパートデータの読み込みに失敗しました");
    	}
    	return isLoaded;
    }

}
