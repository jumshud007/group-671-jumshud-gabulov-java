package classwork_8;

public class Rectangle {
    double width;
    double height;
    public void area() {
   	 System.out.println((width + height) * 2); 
    }
    public Rectangle(double width, double height) {
   	 this.width = width;
   	 this.height = height;
    };
    public void Rectanglescale(double factor) {
   	 System.out.println((width + height) * factor);
    }
}
