package kadai210114.ex2_3;

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

	int calcInitalCost() {

		// 仲介手数料計算
		int fee = 0;
		if (price < 50000) {
			fee = price;
		} else if (price >= 50000 && price < 100000) {
			fee = (int)Math.floor(price * 0.75);
		} else {
			fee = (int)Math.floor(price * 0.5);
		}

		return (int)(price * 2 + Math.floor(price *deposit)
		+ Math.floor(price * keyMoney) + fee);
	}

}
