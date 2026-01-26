package homework_7;

public class Character implements IPrintstats{
     String name;
     int health;
     int strength;
     
     public Character(String name, int health,int strength) {
    	 this.name = name;
    	 this.health = health;
    	 this.strength = strength;
     };
     public void heal(int value) {
    	 health += value;
    	 System.out.println("Your health : " + health );
     };
     public void train(int value) {
    	 strength += value;
    	 System.out.println("Your strength : " + strength);
     }
	 @Override
	 public void IPrintStats() {
		 System.out.println("Name :" + this.name + "; " + "Health :" + this.health + "; " + "Strength :" + this.strength + "!");
	 };
}
