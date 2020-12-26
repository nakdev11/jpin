package jpin1216;

public class Sample1 {

	public static void main(String[] args) {

		A a = new A();
		System.out.println(a);
		a.name = "Java";
		a.sayHello();

		A b = new A();
		b.name = "hoge";
		b.sayHello();

	}

}
