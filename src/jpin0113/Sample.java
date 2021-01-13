package jpin0113;

public class Sample {

	public static void main(String[] args) {

		A.num = 10;
		System.out.println(A.num);

		A.hello();

		A a = new A();
		a.value = 10;
		a.test();
		a.num = 100; // コンパイラがAへのアクセスに書き換える
		a.hello(); // コンパイラがAへのアクセスに書き換える


	}
}
