package jpin210127;

class Sample {
	public static void main(String[] args) {

		try {
			int[] array = new int[0];
			array[0] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("trouble");
		}

		System.out.println("hello");
	}
}