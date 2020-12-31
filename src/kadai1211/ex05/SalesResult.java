package kadai1211.ex05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalesResult {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2010, 4, 1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatDate = date.format(formatter);

		int[] records = new int[3];
		records[0] = 82000;
		records[1] = 46000;
		records[2] = 65000;

		int total = 0;
		for (int i = 0; i < records.length; i++) {
			System.out.println("[" + i + "] total => " + total);
			total += records[i];
		}

		double average = getAverage(total, records.length);

		System.out.println("*** " + formatDate + " ***");
		System.out.println("合計： " + total);
		System.out.println("平均： " + average);

	}

	static double getAverage(int total, double divisor) {
		return total / divisor;
	}
}
