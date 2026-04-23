package classwork_20;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Привет, Мир!");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		int age = 14;
		int age1 = age + 10;
		System.out.println("Now: " + age + "After ten years: " + age1);
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a % 2 == 0) {
			System.out.println("чётное");
		} else {
			System.out.println("нечётное");
		}
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(3 + " * " + i + "= " + 3 * i);
		}
		String name = "Александр";
		System.out.println("Букв: " + name.length());
		System.out.println("Большими: " + name.toUpperCase());
		for (int i = 1; i <= 5; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		}
		System.out.println();
		int[] abc = { 1, 2, 3, 4, 5 };
		for (int i : abc) {
			System.out.println(i);
		}
		int correctnum = 42;
		int a1;
		do {
			Scanner s1 = new Scanner(System.in);
			a1 = s.nextInt();
			if (a1 < correctnum) {
				System.out.println("Меньше");
			} else if (a1 > correctnum) {
				System.out.println("Больше");
			}
		} while (a1 != correctnum);
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 4; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	public static void countVowels(String s) {
		ArrayList arr2 = new ArrayList();
		arr2.add("a");  
		arr2.add("e");  
		arr2.add("i");  
		arr2.add("o");  
		arr2.add("u");
		int count = 0;
		for(String i : s.split("")) {
		if(arr2.contains(i)) {
			count++;
		}	
		}
	}

	public String greet(String name) {
		return "Hi," + name;
	}

	public int max3(int a, int b, int c, int d) {
		if (a > b && a > c) {
			d = a;
		} else if (b > a && b > c) {
			d = b;
		} else if (c < b && a < c) {
			d = c;
		}
		return d;

	}
}
