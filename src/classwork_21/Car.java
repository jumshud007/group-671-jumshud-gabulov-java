package classwork_21;

public class Car {
	String brand;
	String model;
	int year;
	int speed;

	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public void accelerate(int kmh) {
		if (kmh < 201) {
			speed += kmh;
		}
	}
	public void brake(int kmh) {
		if (kmh > 0) {
			speed -= kmh;
		}
	}
    @Override
	public String toString() {return brand + model;}
    
}
