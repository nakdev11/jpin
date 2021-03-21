package jpin210303;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Dictionary {

	private List<String> list = new ArrayList<>();

	public void add(String word) {
		this.list.add(word);
	}

	public Examination createExam(int size) {

		Examination exam = new Examination();

		int r = new Random().nextInt(100);

		for (int i = 0; i < r; i++) {
			Collections.shuffle(list);
		}

		for (int i = 0; i < size; i++) {
			exam.add(new Question(list.get(i)));
		}

		return exam;
	}
}
