package practice.day20210131_1;

public class Triangle implements Shape {

	private double width;
	private double height;

	Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height * 1/2;
	}

}
