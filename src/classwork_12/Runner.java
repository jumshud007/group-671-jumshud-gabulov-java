package classwork_12;

public class Runner {
	public static void main(String[] args) {
		RobotCleaner pilesossik = new RobotCleaner(null);
		pilesossik.start();
		pilesossik.stop();
		pilesossik.charge();
		pilesossik.start();
		// 3
		Hero hero1 = new Hero("Someone");
		Hero hero2 = new Hero("No one");
		hero1.collectCoins(30);
		hero2.collectCoins(30);
		hero1.showInfo();
		hero2.showInfo();
		hero1.collectCoins(40);
		hero2.collectCoins(40);
		hero1.showInfo();
		hero2.showInfo();
		hero1.takedamage(120);
		hero2.takedamage(120); // Hero DIED
		// 4
		Icecream icecream1 = new Icecream("Chocolade", 5.5);
		Icecream icecream2 = new Icecream("Vanil", 5.5);
		Icecream icecream3 = new Icecream("Strawberry", 5.5);
		// - Создай 3 разных мороженых
		// - Одному добавь топпинг
		icecream2.addTopping();
		// - У второго повысь рейтинг дважды
		icecream2.improveRating();
		icecream2.improveRating();
		// - «Съешь» все три
		icecream1.eat();
		icecream2.eat();
		icecream3.eat();
		// 5
		Pet cat = new Pet();
		Pet dog = new Pet();
		Pet pig = new Pet();
		Pet monkey = new Pet();

		Pet[] array = { cat, dog, pig, monkey };
	}
}
