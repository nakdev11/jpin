package jpin201209;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("値を入力してください: ");

		int a = scan.nextInt();

		if ( a < 0) {
			System.out.println("小さすぎます");
		} else if ( a > 100) {
			System.out.println("大きすぎます");
		} else {
			System.out.println("正常です");
		}

		scan.close();

	}
}