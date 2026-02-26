package classwork_14;

public class Cat implements IAnimal {
	String name;
	int age;

	public void sayMeow() {
		System.out.println("Мяу!");
	}

	@Override
	public void makeSound() {
		System.out.println("MEOV");
	}
}
