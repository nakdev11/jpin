package kadai1225.ex1_3;

public class Exercise1 {

	public static void main(String[] args) {

		Section parsonnel = new Section();
		Section sales = new Section();
		Section engineering = new Section();

		parsonnel.setName("人事部");
		sales.setName("営業部");
		engineering.setName("技術部");

		parsonnel.printName();
		sales.printName();
		engineering.printName();
	}

}
