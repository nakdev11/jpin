package jpin210224;

public class Order {

	private Item item;
	private int qty;

	public Order(Item item, int qty) {
		super();
		this.item = item;
		this.qty = qty;
	}

	public int getTotal() {
		return this.qty * this.item.getPrice();
	}

}
