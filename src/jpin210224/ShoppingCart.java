package jpin210224;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart implements Iterable<Order>{

	private List<Order> orders = new ArrayList<>();

	public void addOrder(Order order) {
		orders.add(order);
	}

	public int getTotal() {
		int total = 0;
		for (Order order : orders) {
			total += order.getTotal();
		}
		return total;
	}

	@Override
	public Iterator<Order> iterator() {
		return this.orders.iterator();
	}

}
