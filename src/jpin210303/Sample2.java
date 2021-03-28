package jpin210303;

import java.util.Calendar;
import java.util.Date;

// DateとCalendar
public class Sample2 {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 10);

		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DATE));

		Calendar birth = Calendar.getInstance();
		
		
	}
}
