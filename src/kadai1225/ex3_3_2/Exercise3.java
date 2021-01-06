package kadai1225.ex3_3_2;

public class Exercise3 {

	public static void main(String[] args) {

		if (args.length % 2 != 0) {
			System.out.println("商品情報（商品名、価格）は、ペアで入力してください");
			return;
		}

		Item[] items = new Item[args.length / 2];
		int sum = 0;

		int j = 0;
		String name = "";
		int price;
		for (int i = 0; i < args.length; i++) {
			if (i % 2 == 0) {
				name = args[i];
			} else {
				Item item = new Item();
				item.setName(name);
				price = Integer.parseInt(args[i]);
				item.setPrice(price);
				item.printItem();
				sum += price;

				items[j] = item;
				j++;
			}
		}

		System.out.println("合計金額は、" + sum + "円です" );

		for (Item obj : items) {
			obj.printItem();
		}

//		for (int i = 0; i < items.length; i++) {
//			items[i].printItem();
//		}

	}

}
