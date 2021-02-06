package kadai201225.ex3_1;

public class Exercise3 {

	public static void main(String[] args) {
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();

		item1.setName("消しゴム");
		item1.setPrice(100);
		item2.setName("鉛筆");
		item2.setPrice(50);
		item3.setName("ラインマーカー");
		item3.setPrice(80);

		item1.printItem();
		item2.printItem();
		item3.printItem();
	}
}
