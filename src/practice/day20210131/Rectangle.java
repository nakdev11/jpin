package practice.day20210131;

public class Rectangle extends Shape {

	Rectangle(double width, double height) {
		super(width, height);
	}

	double getArea() {
		return width * height;
	}

}
