package kadai201225.ex3_3;

public class Item {

	int price;
	String name;

	void setPrice(int paramPrice) {
		this.price = paramPrice;
	}

	int getPrice() {
		return this.price;
	}

	void setName(String paramName) {
		this.name = paramName;
	}

	String getName() {
		return this.name;
	}

	void printItem() {
		System.out.println(this.name + "の価格は、" + this.price + "円です");
	}

}
