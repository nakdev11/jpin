package jpin201223;

public class Order {

	Item item;

	int qty;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	int getTotal() {
		int result = item.getPrice() * qty;
		return result;
	}

}
