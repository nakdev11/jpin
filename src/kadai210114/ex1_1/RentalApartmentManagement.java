package kadai210114.ex1_1;

public class RentalApartmentManagement {

	public static void main(String[] args) {

		RentalApartment rentalApartment = new RentalApartment();
		rentalApartment.setName("エステートピア新宿");
		rentalApartment.setNumber(105);
		rentalApartment.setPrice(84000);
		rentalApartment.setDeposit(2.0);
		rentalApartment.setKeyMoney(1.0);

		System.out.print("名称:" + rentalApartment.getName() + " "
				+ rentalApartment.getNumber() + "号室 "
				+ "賃料:" + rentalApartment.getPrice() + "円 "
				+ "敷金:" + rentalApartment.getDeposit() + "ヶ月 "
				+ "礼金:" + rentalApartment.getKeyMoney() + "ヶ月 ");
	}
}
