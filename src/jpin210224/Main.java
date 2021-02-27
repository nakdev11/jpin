package jpin210224;

public class Main {

	public static void main(String[] args) {

		Item apple = new Item("apple", 100);
		Item banana = new Item("banana", 80);
		Item orange = new Item("orange", 120);

		ShoppingCart sc = new ShoppingCart();
		sc.addOrder(new Order(apple, 3));
		sc.addOrder(new Order(banana, 5));
		sc.addOrder(new Order(orange, 2));

		// 小計
		for (Order order : sc) {
			System.out.println(order.getTotal());
		}

		// ショッピングカート合計
		System.out.println(sc.getTotal());

	}
}
