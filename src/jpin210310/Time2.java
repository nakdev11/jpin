package jpin210310;

import java.time.LocalDate;

/**
 * LocalDate,Periodを利用
 * @author nakazy
 *
 */
public class Time2 {

	public static void main(String[] args) {

		LocalDate birth = LocalDate.of(1972, 5, 10);
		LocalDate date = LocalDate.now();

		// 期間を取得する
		System.out.println(birth.until(date));

		System.out.println(birth);
		System.out.println(date);
		System.out.println(date.plusDays(2));

	}


}
