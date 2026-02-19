package classwork_12;

public class Icecream {
	String flavor;
	double price;
	boolean hasToppin = false;
	int rating = 3;

	public Icecream(String flavor, double price) {
		this.flavor = flavor;
		this.price = price;
	}

	public void addTopping() {
		hasToppin = true;
		price += 0.5;
	}

	public void eat() {
		System.out.println("ммм… вкуснятина!");
		rating += 3;
	}

	public void improveRating() {
		rating += Math.round(Math.random() * 4 + 1);
	}
}
