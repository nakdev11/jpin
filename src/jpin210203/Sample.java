package jpin210203;

public class Sample {

	public static void main(String[] args) {

//		A a = new B();　使う側の中に使われる側のコードを無くす
//		戻り値にポリモーフィズムを使う
		A a = Factory.create();
//		a.hello();

//		引数にポリモーフィズムを使う
		Display d = new Display();
		d.show(a);

	}

}
