package kadai201219;

public class Sample {

	public static void main(String[] args) {

		// 配列を利用 pop時に要素削除しない
		Stack stack = new Stack();

		stack.push("A");
		stack.push("B");
		stack.push("C");

		int size = stack.size();
		for (int i = 0; i < size; i++) {
			System.out.println(stack.pop());
		}

		// Listを利用 pop時に要素を削除する
		Stack2 stack2 = new Stack2();

		stack2.push("A");
		stack2.push("B");
		stack2.push("C");

		int size2 = stack2.size();
		for (int i = 0; i < size2; i++) {
			System.out.println(stack2.pop());
		}

	}
}
