package jpin210127;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Typing {

	public static void main(String[] args) {

		String[] words = {
				"abstract",
				"assert",
				"boolean",
				"break",
				"byte",
				"case",
				"catch",
				"char",
				"class",
				"const",
				"continue",
				"default",
				"do",
				"double",
				"else",
				"enum",
				"extends",
				"final",
		};

		// 出題数
		final int NUMBER_OF_QUESTIONS = 5;
		// トータルスコア
		int score = 0;
		// ワードをシャッフルする
		List<String> questions = Arrays.asList(words);
		Collections.shuffle(questions);
		// 標準入力
		Scanner scan = new Scanner(System.in);
		// スタート表示
		System.out.println("タイピングゲーム スタート");
		System.out.println("全部で" + NUMBER_OF_QUESTIONS + "問");
		System.out.println();

		for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
			// シャッフルしたワードの先頭から出題する
			String question = questions.get(i);
			// 問題表示、入力待ち
			System.out.println("問題" + (i + 1) + ": " + question);
			System.out.print("> ");
			String input = scan.next();

			// 正誤判定
			if (input.equals(question)) {
				score += 1;
				System.out.println("-> OK");
			} else {
				System.out.println("-> NG");
			}
			System.out.println();

		}

		// ゲーム終了、スコア表示
		System.out.println();
		System.out.println("トータルスコア: " + score + "/" + NUMBER_OF_QUESTIONS);

		scan.close();

	}

}
