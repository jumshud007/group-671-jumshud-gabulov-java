package classwork_15;

public class Rectangle implements IResizable {
	double width;
	double heigth;

	@Override
	public void resize(double factor) {
		width /= factor;
		heigth /= factor;
	    System.out.println("WIdth :" + width + "; Heigth :" + heigth );
	}
}
