package kadai201211.ex02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalesResult {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2010, 4, 1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatDate = date.format(formatter);

		int[] records = new int[3];
		records[0] = 65000;
		records[1] = 73000;
		records[2] = 90000;

		int total = records[0] + records[1] + records[2];
		int average = total / records.length;

		System.out.println("*** " + formatDate + " ***");
		System.out.println("合計： " + total);
		System.out.println("平均： " + average);

	}
}
