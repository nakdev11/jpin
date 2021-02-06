package kadai201219;

import java.util.ArrayList;
import java.util.List;

public class Stack2 {

	private List<String> list = new ArrayList<>();

	public void push(String str) {
		list.add(str);
	}

	public String pop() {
		String ret = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return ret;
	}

	public int size() {
		return list.size();
	}

}
