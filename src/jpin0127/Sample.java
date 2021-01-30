package jpin0127;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {

	public static void main(String[] args) {

		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));

		String line = null;
		int total = 0;

		System.out.print("> ");

			try {
				while((line = in.readLine()) != null) {

					try {
						int input = Integer.parseInt(line);
						if (input == 0) {
							break;
						}
						total += input;
					} catch (NumberFormatException e) {
						System.out.println("不正な値です");
					}
					System.out.print("> ");
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

		System.out.println(total);

	}

}
