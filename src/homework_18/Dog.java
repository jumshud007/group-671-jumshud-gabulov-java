package homework_18;

public class Dog {
	String name;
	String breed;
	int age;

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	void bark() {System.out.println(name + "говорит: Гав!");}
	void introduce() {System.out.println("Name :" + name + "; Breed :" + breed + "; Age :" + age);}

}
