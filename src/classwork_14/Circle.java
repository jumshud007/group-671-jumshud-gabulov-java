package classwork_14;

public class Circle implements IDrawable {
	@Override
	public void draw() {
		System.out.println("Draving Circle");
	}

	double radius;

	public void getArea() {
		System.out.println(2 * 3 * (radius * radius));
	}

	public void getLength() {
		System.out.println(2 * 3 * radius);
	}

}
