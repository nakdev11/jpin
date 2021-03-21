package jpin210303;

import java.util.HashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");

		for (Integer key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}
}
