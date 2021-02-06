package practice.day20210131;

public class Triangle extends Shape {

	public Triangle(double width, double height) {
		super(width, height);
	}

	@Override
	double getArea() {
		return width * height * 1/2;
	}

}
