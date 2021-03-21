package jpin210317;

public class Main {

	public static void main(String[] args) {

		ItemCatalog itemCatalog = new ItemCatalog();

		for (Item item : itemCatalog.getItemCatalog()) {
			System.out.println("no: " + item.getNo() );
			System.out.println("name: " + item.getName());
			System.out.println("price: " + item.getPrice());
			System.out.println("----------");
		}
	}
}
