package classwork_12;

public class Kitten {
	String name;
	int ageMonths = 2;
	int happiness = 30;
	String color;

	public Kitten(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void play() {
		happiness += 20;
		if (happiness > 100) {
			happiness = 100;
		}
	}

	public void eat() {
		happiness += 15;
	}

	public void sleep() {
		happiness += 10;
	}

	public void status() {System.out.println("Name :" + name + "; Month :" + ageMonths + "; Happiness :" + happiness + "; Color :" + color);}
	public void bonus() {if(happiness<10){
		System.out.println();
	}
  }
}