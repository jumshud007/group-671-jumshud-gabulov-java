package classwork_25;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		// 1
		String name = "Jumshud";
		System.out.println("Privet, " + name);
	    // 2
		int year = 2026;
		int age = 13;
		System.out.println(year - age);
		// 3
		double width = 2.4;
		double height = 3.5;
		System.out.println(width * height);
		// 5
		int time = 150;
		System.out.println(150 / 60 + "ч " + 150 % 60 + "мин");
	    // 6
		int price = 50;
		double skidka = 0.12;
		System.out.println(price + price * skidka );
	    // 7
		int radius = 5;
		System.out.println(Math.PI * 2 * radius);
		System.out.println(Math.PI * 2 * radius * radius);
	    // 8
		String firstName = "Jumshud";
		String lastName = "Jem";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		// 9
		int temperature = 10;
		System.out.println(temperature * 9 / 5 + 32);
	    // 10
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		// 11
		Scanner h1 = new Scanner(System.in);
		int a1 = h1.nextInt();
		if(a1 % 2 == 0) {System.out.println("Cetnoe");}
		else {System.out.println("Necetnoe");}
		// 12
		int a2 = 3;
		int b = 5;
		if(a2 > b) {System.out.println("cislo 'a' > cisla 'b' ");}
		else if(b > a2) {System.out.println("cislo 'b' > cisla 'a' ");}
		else {System.out.println("Cisla ravni");}
		// 13
		int b2 = 4;
		if( b > 0) {System.out.println("Polojitelnoe");}
		else if( b < 0) {System.out.println("Otrizatelnoe");}
		else {System.out.println("cislo ravno nulu");}
	    // 14
		int score = 82;
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		}
		if (score >= 75 && score <= 89) {
			System.out.println("B");
		}
		if (score >= 60 && score <= 69) {
			System.out.println("C");
		}
		if (score >= 0 && score <= 49) {
			System.out.println("F");}
		}
	}
