package classwork_13;

public class Rexctangle {
	double width;
	double height; 
    public Rexctangle(double width,double height) {this.width = width;this.height = height;}
    double s = 1;
    public void getArea() {System.out.println(width * height);s = width * height;}
    double p = 1;
    public void getPerimetr() {System.out.println((width + height) * 2); p = (width + height) * 2;}
    public void printInfo() {System.out.println("Width :" + width + "; Heigth" + height + "Perimetr" + p + "Area" + s);}
 
}
