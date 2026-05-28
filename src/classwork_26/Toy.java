package classwork_26;

public class Toy {
	String name;
	int price;
	boolean batteryRequired;
	   void getInfo() {System.out.println("Name :" + name + "Price :" + price);}
	   public Toy(String name, int price, boolean batteryRequired) {
		super();
		this.name = name;
		this.price = price;
		this.batteryRequired = batteryRequired;
	   }
}
