package jpin210324;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * nioパッケージを利用する
 * @author nakazy
 *
 */
public class Sample3 {

	public static void main(String[] args) throws Exception {

		Path path = Path.of("testSample.txt");
		System.out.println(path.toUri());
		if (Files.exists(path) == false) {
			Files.createFile(path);
		} else {
			Files.delete(path);
		}
		Files.writeString(path, "hello world");

		
	}
}
