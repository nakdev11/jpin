package kadai1225.ex3_3;

public class Exercise3 {

	public static void main(String[] args) {

		if (args.length % 2 != 0) {
			System.out.println("商品情報（商品名、価格）は、ペアで入力してください");
			return;
		}

		Item item = new Item();
		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			if (i % 2 == 0) {
				item.setName(args[i]);
			} else {
				int price = Integer.parseInt(args[i]);
				item.setPrice(price);
				item.printItem();
				sum += price;
			}
		}

		System.out.println("合計金額は、" + sum + "円です" );
	}
}
