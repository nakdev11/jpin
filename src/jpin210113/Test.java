package jpin210113;

public class Test {

	private int num = 10;

	public static void execute() {
		// staticメンバからdynamicメンバはアクセス出来ない
		//		System.out.println(num);
		System.out.println(new Test().num);
	}
}
