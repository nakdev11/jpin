package jpin210303;

import java.util.ArrayList;
import java.util.List;

public class Examination {

	private List<Question> list = new ArrayList<>();

	public void add(Question question) {
		this.list.add(question);
	}

}
