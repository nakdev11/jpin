package jpin210224;

public class Main {

	public static void main(String[] args) {

		Order ord1 = new Order(new Item("apple", 100), 3);
		Order ord2 = new Order(new Item("banana", 80), 5);

		ShoppingCart sc = new ShoppingCart();
		sc.addOrder(ord1);
		sc.addOrder(ord2);

		System.out.println(sc.getTotal());

	}
}
