package jpin210224;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {

		// ジェネリクスを利用しない
//		List list = new ArrayList();
//
//		list.add("A");
//		list.add("B");
//		list.add("C");
//
//		showAll(list);
//	}
//
//	private static void showAll(List list) {
//		for (Object obj : list) {
//			String str = (String)obj;
//			System.out.println(str);
//		}

		// ジェネリクスを利用する
		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");

		showAll(list);
	}

	private static void showAll(List<String> list) {
		for (String str : list) {
			System.out.println(str);
		}
	}

}
