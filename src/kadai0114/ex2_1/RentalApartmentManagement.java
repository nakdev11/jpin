package kadai0114.ex2_1;

import kadai0114.commons.utility.StandardInputReader;

public class RentalApartmentManagement {

	public static void main(String[] args) {

		String name = StandardInputReader.getInputString("アパート名称を入力してください:");
		int number = StandardInputReader.getInputInt("部屋番号を入力してください:");
		int price = StandardInputReader.getInputInt("賃料を入力してください:");
		double deposit = StandardInputReader.getInputDouble("敷金を入力してください");
		double keyMoney = StandardInputReader.getInputDouble("礼金を入力してください");

		RentalApartment rentalApartment = new RentalApartment(name, number, price, deposit, keyMoney);


		System.out.print("名称:" + rentalApartment.getName() + " "
				+ rentalApartment.getNumber() + "号室 "
				+ "賃料:" + rentalApartment.getPrice() + "円 "
				+ "敷金:" + rentalApartment.getDeposit() + "ヶ月 "
				+ "礼金:" + rentalApartment.getKeyMoney() + "ヶ月 "
				+ "初期費用:" + rentalApartment.calcInitalCost() + "円");
	}
}
