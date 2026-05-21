package homework_18;

public class Rectangle {
	double width;
	double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	void perimeter() {
		System.out.println(2 * (width + height));
	}

	void isSquare() {
		System.out.println(width == height);
	}
}
