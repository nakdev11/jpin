package jpin210317;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Sample3 {

	public static void main(String[] args) {

		File file = new File("sample.txt");

		// java1.4まで
		try ( Reader reader = new FileReader(file); Test t = new Test()){
			int i = 0;
			while((i = reader.read()) != -1) {
				char c = (char)i;
				System.out.print(c);
			}
		} catch (Exception e) {
				System.out.println(e.getStackTrace());
		}
	}

}
