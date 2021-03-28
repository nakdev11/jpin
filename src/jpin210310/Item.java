package jpin210310;

/**
 * 不変オブジェクト
 * @author nakazy
 *
 */
public class Item {

	String name;
	int price;

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Item setName(String name) {
		return new Item(name, this.price);
	}

	public int getPrice() {
		return price;
	}

	public Item setPrice(int price) {
		return new Item(this.name, price);
	}

}
