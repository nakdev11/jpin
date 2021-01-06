package jpin0106;

public class Sample {

	public static void main(String[] args) {

		int[] array = new int[3];
		array[0] =10;
		array[1] =20;
		array[2] =30;

		int[] array2 = array;
		array2[0] = 100;

		for (int i : array) {
			System.out.println(i);
		}

		array[0] = 10;

		System.out.println("-----------");

		for (int i : array2) {
			System.out.println(i);
		}

		System.out.println("-----------");

		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}

	}
}
