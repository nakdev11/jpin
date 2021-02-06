package practice.day20210131;

public abstract class Shape {

	double width;
	double height;

	public Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}

	abstract double getArea();

}
