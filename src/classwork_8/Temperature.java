package classwork_8;

public class Temperature {
    double celsius;
    public Temperature(double celsius) {
 	   this.celsius = celsius;
    }
    public void toFarenheit() {
 	   System.out.println(celsius * 5 / 9 + 32);   
    }
    public void fromFarenheit(double f) {
 	   System.out.println(f * 9 / 5 - 32);
    }
}
