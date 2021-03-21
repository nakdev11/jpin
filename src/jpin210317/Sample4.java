package jpin210317;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Sample4 {

	public static void main(String[] args) throws Exception {

//		File file = new File("sample.txt");

		Reader reader = new FileReader("sample.txt");
		BufferedReader in = new BufferedReader(reader);

		Writer writer = new FileWriter("sample_kb.txt");
		BufferedWriter out = new BufferedWriter(writer);

		try (in; out) {

			String line = null;
			while ((line = in.readLine()) != null) {
				out.write(line);
				out.newLine();
			}

			out.flush();
		}

	}
}
