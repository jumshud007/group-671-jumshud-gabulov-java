package homework_18;

public class GameCharacter {
	String name;
	int health = 100;
	int level = 1;

	void takeDamage(int damage) {
		if (damage < 101) {
			health -= damage;
		}
	}

	void heal(int amount) {
		if (amount < 101) {
			health += amount;
		}
	}

	void isAlive() {
		System.out.println(health > 0);
	}

	void levelUp() {
		level++;
	}
}
