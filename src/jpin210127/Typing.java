package jpin210127;

import java.util.Random;
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

		// スコア
		int score = 0;
		//  問題
		String question = null;
		// 出題数
		final int number_of_questions = 5;
		// 出題済問題
		String[] old_questions = new String[number_of_questions];
		// 乱数生成
		Random random = new Random();
		// 標準入力
		Scanner scan = new Scanner(System.in);
		// スタート表示
		System.out.println("タイピングゲーム スタート");
		System.out.println("全部で" + number_of_questions + "問");
		System.out.println();

		for (int i = 0; i < number_of_questions; i++) {

			// 問題の設定（出題済の問題を出さない）
			// 問題設定出来たら抜けるためのフラグ
			boolean flg = true;
			while (flg) {
				// 出題済の問題と同じ場合立てるフラグ
				boolean same_flg = false;
				// インデックス（乱数）生成
				int idx = random.nextInt(words.length - 1);
				// 出題済問題かチェック
				for (int j = 0; j < old_questions.length; j++) {
					if (words[idx].equals(old_questions[j])) {
						 same_flg = true;
						 break;
					}
				}
				// 出題済でなければ、問題を設定
				if (!(same_flg)) {
					question = words[idx];
					old_questions[i] = question;
					flg = false;
//					System.out.println("old_questions" +"[" + i + "]: " + old_questions[i]);
				}
			}

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
		System.out.println("トータルスコア: " + score + "/" + number_of_questions);

		scan.close();

	}

}
