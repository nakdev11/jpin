package kadai0114.ex1_3;

public class RentalApartmentManagement {

	public static void main(String[] args) {

		RentalApartment rentalApartment = new RentalApartment("エステートピア新宿", 105, 84000, 2.0, 1.0);

		System.out.print("名称:" + rentalApartment.getName() + " "
				+ rentalApartment.getNumber() + "号室 "
				+ "賃料:" + rentalApartment.getPrice() + "円 "
				+ "敷金:" + rentalApartment.getDeposit() + "ヶ月 "
				+ "礼金:" + rentalApartment.getKeyMoney() + "ヶ月 "
				+ "初期費用:" + rentalApartment.calcInitalCost() + "円");
	}
}
