package kadai1225.ex1_2;

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
