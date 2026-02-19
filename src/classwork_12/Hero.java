package classwork_12;

public class Hero {
	String name;
	int level = 1;
	int hp = 100;
	int coins;

	public Hero(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println("Name :" + name + "; Level :" + level + "; Hp :" + hp + "; Coins :" + coins);
	}

	public void takedamage(int damage) {
		hp -= damage;
		if (hp <= 0) {
			System.out.println("Герой погиб ☠️");
		}
	}

	public void collectCoins(int amount) {
		coins += amount;
	}

	public void levelUp() {
		if (coins >= 50) {
			level++;
			hp += 30;
			coins -= 50;
		}
	}
}
