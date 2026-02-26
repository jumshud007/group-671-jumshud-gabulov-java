package classwork_14;

public class Dog implements IAnimal {
	String name;
	int age;
	String breed;

	public void bark() {
		System.out.println("Гав-гав!");
	}

	@Override
	public void makeSound() {
		System.out.println("HAV-HAV");
	}
}
