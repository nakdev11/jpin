package jpin0106;

public class Main {

	public static void main(String[] args) {

		List list = new List();
		list.add("A");
		list.add("B");
		list.add("C");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
