package jpin210224;

import java.util.Iterator;
import java.util.List;

public class Sample2 {

	public static void main(String[] args) {

		List<String> list = List.of("A", "B", "C");

		// コレクションからイテレーターを取り出す
		Iterator<String> ite = list.iterator();

		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

		// 拡張for文をコンパイルすると上のイテレーターの文になる
		for (String str : list) {
			System.out.println(str);
		}

	}
}
