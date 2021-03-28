package jpin210324;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * シリアライズしたファイルをデシリアライズする
 * @author nakazy
 *
 */
public class Sample2 {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("item.ser");
		ObjectInputStream in = new ObjectInputStream(fis);

		try (in) {
			Item item = (Item)in.readObject();
			System.out.println(item);
		}
	}

}
