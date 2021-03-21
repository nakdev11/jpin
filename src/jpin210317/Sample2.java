package jpin210317;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Sample2 {

	public static void main(String[] args) {

		File file = new File("sample.txt");

		// try with resource
		try (Reader reader = new FileReader(file)) {
			int i = 0;
			while((i = reader.read()) != -1) {
				char c = (char)i;
				System.out.print(c);
			}
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
	}

}
