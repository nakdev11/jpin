package jpin0113;

public class Main {

	public static void main(String[] args) {

		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();

		a.setValue("hello");
		System.out.println(a.getValue());
		System.out.println(b.getValue());

		System.out.println("------");

		b.setValue("bye");
		System.out.println(a.getValue());
		System.out.println(b.getValue());


	}

}
