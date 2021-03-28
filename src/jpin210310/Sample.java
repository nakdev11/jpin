package jpin210310;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormat,SimpleDateFormatを使う
 * @author nakazy
 *
 */
public class Sample {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();

		DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");

		// 指定した書式で日時を文字列にする
		String result = formatter.format(date);
		// 文字列からDate型を作る
		Date hoge = formatter.parse(result);

		System.out.println(formatter.format(date));

		System.out.println(date.getTime());
		System.out.println(hoge.getTime());
	}
}
