package jpin1209;

public class Sample2 {


	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int result1 = add(a, b);
		int result2 = subtract(a , b);

		System.out.println(result1);
		System.out.println(result2);

	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int subtract(int x, int y) {
		return x - y;
	}

}
