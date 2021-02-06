package kadai201225.ex1_3;

class Section {

	String name;

	void setName(String paramName) {
		this.name = paramName;
	}

	String getName() {
		return this.name;
	}

	void printName() {
		System.out.println("セクション名は、" + this.name + "です");
	}
}
