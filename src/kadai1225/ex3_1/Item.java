package kadai1225.ex3_1;

public class Item {

	int price;
	String name;

	void setPrice(int paramPrice) {
		this.price = paramPrice;
	}

	void setName(String paramName) {
		this.name = paramName;
	}

	void printItem() {
		System.out.println(this.name + "の価格は、" + this.price + "円です");
	}

}
