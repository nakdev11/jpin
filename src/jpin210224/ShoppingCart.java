package jpin210224;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Order> orders = new ArrayList<>();

	public void addOrder(Order order) {
		orders.add(order);
	}

	public List<Order> getOrder() {
		return orders;
	}

	public int getTotal() {
		int total = 0;
		for (Order order : orders) {
			total += order.getTotal();
		}
		return total;
	}


}
