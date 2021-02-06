package jpin201209;

public class Sample {

	public static void main(String[] args) {


		// int型しか扱わない配列型変数のarrayを宣言して、
		// ３つのint型を扱える配列を新しく作って、変数に代入する
//		int[] array = new int[3];
//		array[0] = 10;
//		array[1] = 20;
//		array[2] = 30;

		int[] array = {10, 20, 30, 40, 50};

//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}

		for (int num: array) {
			System.out.println(num);
		}

	}

}
