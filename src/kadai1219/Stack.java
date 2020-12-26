package kadai1219;

public class Stack {

	private String[] array = new String[10];
	private int index = 0;

	public void push(String str) {
		this.array[index] = str;
		index++;
	}

	public String pop() {
		index--;
		return this.array[index];
	}

	public int size() {
		return this.index;
	}

}
