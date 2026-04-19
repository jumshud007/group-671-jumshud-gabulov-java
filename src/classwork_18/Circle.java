package classwork_18;

public class Circle implements IDrawable{
    int radius;
    int length;
    @Override
	public void draw() {System.out.println("Radius :" + radius + "Length :" + length);}

}
