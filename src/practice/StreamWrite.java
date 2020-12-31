package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class StreamWrite {

	public static void main(String[] args) {

		try (var writer = Files.newBufferedWriter(Paths.get("/Users/nakazy/jpin/work/data.log"))) {
			writer.write(LocalDateTime.now().toString());
			writer.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (var reader = Files.newBufferedReader(Paths.get("/Users/nakazy/jpin/work/input.txt"))) {
			var line = "";
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
