package kadai1211.ex01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalesResult {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2010, 4, 1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatDate = date.format(formatter);

		int tokyo = 65000;
		int osaka = 73000;
		int nagoya = 90000;

		int total = tokyo + osaka + nagoya;
		int average = total / 3;

		System.out.println("*** " + formatDate + " ***");
		System.out.println("合計： " + total);
		System.out.println("平均： " + average);


	}
}
