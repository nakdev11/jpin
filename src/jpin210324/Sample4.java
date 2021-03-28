package jpin210324;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * nioパッケージを利用する
 * @author nakazy
 *
 */
public class Sample4 {

	public static void main(String[] args) throws Exception {

		Path path = Path.of("testSample.txt");
		BufferedReader in = Files.newBufferedReader(path);
//		String line = null;
//		while ((line = in.readLine()) != null) {
//			System.out.println(line);
//		}
		try (in) {
			in.lines().forEach(System.out::println);
		}


	}
}
