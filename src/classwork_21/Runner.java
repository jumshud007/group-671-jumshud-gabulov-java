package classwork_21;

public class Runner {
	public static void main(String[] args) {
		Cat cat1 = new Cat("Miles", "green", 19);
		cat1.meow();
		Rectangle rec1 = new Rectangle(2.2, 3.5);
		Rectangle rec2 = new Rectangle(3.2, 4.5);
		double a = rec1.area();
		double b = rec2.area();
		if (a > b) {
			System.out.println(a + ">" + b);
		} else {
			System.out.println(b + ">" + a);
		}
        BankAccount b1 = new BankAccount(1230);
        b1.deposit(19);
        b1.withdraw(290);
  	    Car car1 = new Car("mercedes", "m5", 1999);
  	    car1.accelerate(150);
  	    car1.brake(200);
  	    System.out.println(car1.brand + car1.model + car1.speed + car1.year);
	}
}
