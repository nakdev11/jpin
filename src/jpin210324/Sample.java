package jpin210324;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * インスタンスをシリアライズする
 * @author nakazy
 *
 */
public class Sample {

	public static void main(String[] args) throws Exception {

		Item item = new Item("apple", 100);

		FileOutputStream fos = new FileOutputStream("item.ser");
		ObjectOutputStream out = new ObjectOutputStream(fos);

		try (out) {
			out.writeObject(item);
		}

	}

}
