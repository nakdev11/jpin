package kadai210114.ex2_2;

import kadai210114.commons.utility.StandardInputReader;

public class RentalApartmentManagement {

	public static void main(String[] args) {

		RentalApartment[] rentalApartments = new RentalApartment[3];

		for (int i = 0; i < rentalApartments.length; i++) {

			String name = StandardInputReader.getInputString("アパート名称を入力してください:");
			int number = StandardInputReader.getInputInt("部屋番号を入力してください:");
			int price = StandardInputReader.getInputInt("賃料を入力してください:");
			double deposit = StandardInputReader.getInputDouble("敷金を入力してください");
			double keyMoney = StandardInputReader.getInputDouble("礼金を入力してください");

			rentalApartments[i] = new RentalApartment(name, number, price, deposit, keyMoney);
		}

		for (RentalApartment rentalApartment : rentalApartments) {
			System.out.print("名称:" + rentalApartment.getName() + " "
					+ rentalApartment.getNumber() + "号室 "
					+ "賃料:" + rentalApartment.getPrice() + "円 "
					+ "敷金:" + rentalApartment.getDeposit() + "ヶ月 "
					+ "礼金:" + rentalApartment.getKeyMoney() + "ヶ月 "
					+ "初期費用:" + rentalApartment.calcInitalCost() + "円");
			System.out.println("");
		}
	}
}
