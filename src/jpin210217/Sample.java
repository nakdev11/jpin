package jpin210217;

public class Sample {

	public static void main(String[] args) {

		A a = new A(100);
		A b = new A(100);

		System.out.println(a == b);
		System.out.println(a.equals(b));

		System.out.println("-----");

		Item c = new Item(100, "apple");
		Item d = new Item(100, "banana");

		System.out.println(c == d);
		System.out.println(c.equals(d));

	}
}
