package jpin210310;

/**
 * 不変オブジェクトを利用
 * @author nakazy
 *
 */
public class Test {

	public static void main(String[] args) {

		Item apple = new Item("apple", 100);
		Item result = apple.setPrice(200);
		System.out.println(apple.getPrice());
		System.out.println(result.getPrice());

		// Stringは不変オブジェクト
		String str = "hoge";
		str.replaceAll("o", "u");
		System.out.println(str);
	}
}
