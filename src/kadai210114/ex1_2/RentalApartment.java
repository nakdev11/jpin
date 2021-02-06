package kadai210114.ex1_2;

public class RentalApartment {
	String name;
	int number;
	int price;
	double deposit;
	double keyMoney;

	RentalApartment(String name, int number, int price,
			double deposit, double keyMoney) {
		this.name = name;
		this.number = number;
		this.price = price;
		this.deposit = deposit;
		this.keyMoney = keyMoney;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getKeyMoney() {
		return keyMoney;
	}
	public void setKeyMoney(double keyMoney) {
		this.keyMoney = keyMoney;
	}

}
