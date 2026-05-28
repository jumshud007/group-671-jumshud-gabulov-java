package classwork_26;

public class Runner {
	public static void main(String[] args) {
	  Phone phone1 = new Phone("Iphone","15",100);
	  phone1.call(23);
	  
	  Student student1 = new Student("jum");
	  
	  Dog dog1 = new Dog();
	  dog1.name = "maks";
	  dog1.makeSound();
	  
	  ElectronicToy toy1 = new ElectronicToy();
	  toy1.getInfo();
	  
	  GameCharacter character1 = new GameCharacter();
	  character1.attack();
	  Mage mage1 = new Mage();
	  mage1.attack();
	}
}
