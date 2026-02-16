package classwork_11;

import java.util.Arrays;

public class Classwork_11 {
    public static void main(String[] args) {		
	 // 1
     Hero hero1 = new Hero("Tom Holland", 110, 50, 99); 
     Hero hero2 = new Hero("Tobey Maquire", 200, 150, 9999); 
     Hero hero3 = new Hero("Andriew Garfield", 100, 40, 999); 
     System.out.println(hero1.name + " VS " + hero2.name);
     int i = 0;
     int a = 0;
     if(hero1.health > hero2.health) {
		i++;
	 } else {
		a++;
	 }
     if(hero1.level > hero2.level) {
 		i++;
 	 } else {
		a++;
	 }
     if(hero1.strength > hero2.strength) {
 		i++;
 	 } else {
		a++;
	 }
     if(a > i) {
    	 System.out.println(hero2.name + "won!!!!");
     } 
     if(i > a) {
    	 System.out.println(hero1.name + "won!!!!");
     }
     hero1.showInfo();
     hero1.takeDamage(34);
     hero1.attack();
     hero2.showInfo();
     hero2.takeDamage(34);
     hero2.attack();
     hero3.showInfo();
     hero3.takeDamage(34);
     hero3.attack();
     // 2
     Monster monster1 = new Monster();
     monster1.type = "Огненный";
     monster1.attack();
     monster1.roar();
     monster1.specialAbility();
     
     Monster monster2 = new Monster();
     monster2.type = "Ледяной";
     monster2.attack();
     monster2.roar();
     monster2.specialAbility();
     
     Monster monster3 = new Monster();
     monster3.type = "Ядовитый";
     monster3.attack();
     monster3.roar();
     monster3.specialAbility();
     // 4
     Car car1 = new Car();
     car1.fuel = 0;
     car1.speed = 15;
     Car car2 = new Car();
     car2.fuel = 15;
     car2.speed = 90;
     Car car3 = new Car();
     car3.fuel = 1;
     car3.speed = 25;
     int max = car1.speed;
     max = Math.max(max,car2.speed); 
     max = Math.max(max,car3.speed); 
     if(car1.speed == 0) {System.out.println("Mашина не едет.");}
     if(car2.speed == 0) {System.out.println("Mашина не едет.");}
     if(car3.speed == 0) {System.out.println("Mашина не едет.");}
     
     Student student1 = new Student();
     student1.grade = 30;
     Student student2 = new Student();
     student2.grade = 10;
     Student student3 = new Student();
     student3.grade = 25;
     Student student4 = new Student();
     student4.grade = 90;
     Student student5 = new Student();
     student5.grade = 120;
     int[] array = {student1.grade,student2.grade,student3.grade,student4.grade,student5.grade};
     Arrays.sort(array);
     System.err.println("Samiy visokiy bal :" + array[array.length - 1]);
     System.out.println("Sredniy bal :" + ((array[0] + array[1] + array[2] + array[3] + array[4] + array[5]) / array.length));
    }
}