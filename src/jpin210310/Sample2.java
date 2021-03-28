package jpin210310;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

// 入力値のフォーマットをチェックする（yyyy/MM/dd）
// 不正な日付をチェックする

/**
 * 入力値のフォーマットと不正な日付をチェックする
 * @author nakazy
 *
 */
public class Sample2 {

	/**
	 * メインメソッドだよ
	 * @param args
	 */
	public static void main(String[] args) {
		DateFormat formatter = new SimpleDateFormat("yyyy/M/d");
		formatter.setLenient(false);

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str = scan.nextLine();
			try {
				formatter.parse(str);
				System.out.println("正しい日付です");
			} catch (ParseException e) {
				System.out.println("不正な日付です");
			}
		}

		scan.close();
	}
}
