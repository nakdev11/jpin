package jpin0127;

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

		int score = 0;
		final int number_of_questions = 5;

		Random random = new Random();

		Scanner scan = new Scanner(System.in);

		System.out.println("Typing Game");
		System.out.println();

		for (int i = 0; i < number_of_questions; i++) {

			int idx = random.nextInt(words.length - 1);
			String answer = words[idx];
			System.out.println("Q" + (i + 1) + ": " + answer);
			System.out.println();

			System.out.print("> ");
			String input = scan.next();

			if (input.equals(answer)) {
				score += 1;
				System.out.println();
				System.out.println("--> OK");
			} else {
				System.out.println();
				System.out.println("--> NG");
			}
			System.out.println();

		}

		scan.close();

		System.out.println();
		System.out.println("score: " + score + "/" + number_of_questions);


	}



}
