package classwork_8;

import homework_7.Character;

public class Classwork_8 {
public static void main(String[] args) {
	// 1 
	Account account1 = new Account();
	account1.deposite(2345);
	account1.withdraw(2346);
	account1.getbalance();
	// 2
	Rectangle rectangle1 = new Rectangle(5, 7);
	rectangle1.area();
	rectangle1.Rectanglescale(3);
	// 3
	Temperature temperature1 = new Temperature(36);
    temperature1.toFarenheit();
    temperature1.fromFarenheit(10);
    // 5
    Character character1 = new Character("Jum", 90 , 100);
    character1.heal(10);
    character1.train(13);
    character1.IPrintStats();
    // 6
    Book book1 = new Book("Harry Potter","J.K.Rouling", 1);
    Book book2 = new Book("Harry Potter","J.K.Rouling");
    book1.printInfo();
    book2.printInfo();
    // 7
    Car car1 = new Car();
    car1.printDetails();
}
}
