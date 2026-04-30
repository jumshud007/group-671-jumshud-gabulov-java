package classwork_21;

public class Rectangle {
	double width;
	double heigth;

	public Rectangle(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	public double area() {
		return width * heigth;
	}
	public double perimetr() {
		return 2 * (width + heigth);
	}
	public void describe() {
		System.out.println("Width :" + width + ";Heigth :" + heigth);
	}
	
}
