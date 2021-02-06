package jpin210106;

public class Test {

	public static void main(String[] args) {

		// オレンジ100円で１個、りんご120円で2個、バナナ80円で3個
		Item item1 = new Item("orange", 100);
//		item1.setName("orange");
//		item1.setPrice(100);

		Item item2 = new Item("apple", 120);
//		item2.setName("apple");
//		item2.setPrice(120);

		Item item3 = new Item("banana", 80);
//		item3.setName("banana");
//		item3.setPrice(80);

		// orderのインスタンスを作る
		Order order1 = new Order(item1, 1);
//		order1.setItem(item1);
//		order1.setQty(1);

		Order order2 = new Order(item2, 2);
//		order2.setItem(item2);
//		order2.setQty(2);

		Order order3 = new Order(item3, 3);
//		order3.setItem(item3);
//		order3.setQty(3);

		// shoppingCartのインスタンスを作る
		// shoppingCartにorderを入れる
		ShoppingCart sc = new ShoppingCart();
		sc.add(order1);
		sc.add(order2);
		sc.add(order3);

		// shoppingCartの合計金額を表示する
		System.out.println(sc.getTotal());
	}
}
