package jpin210127;

public class Main {

	public static void main(String[] args) {

		for (EnumTest e : EnumTest.values()) {
			System.out.println(e.ordinal() + ":" + e.toString());
		}
		System.out.println(EnumTest.valueOf("SUMMER"));

	}
}
