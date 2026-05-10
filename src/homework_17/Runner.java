package homework_17;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		// 1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// 2
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
		// 3
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		// 4
		for (int i = 1 ;i <= 10; i++) {
			System.out.println(7 + " * " + i + "= " + 7 * i);
		}
		// 5
		int a = 10;
		do {
		System.out.println(a);
		a--;
		}while(a >= 1);
		// 6
		int number = 58342;
		int num = 0;
		do {
			num++;
			number /= 10;
		}while(number / 10 > 0);
		num++;
		System.out.println(num);
		// 7
		int number2 = 4567;
		int b = 0;
		int sum2 = 0;
		do {
			b = number2 % 10;
			sum+= b;
			number2 /= 10;
		}while(number2 != 0);
		// 8
		do {
			System.out.println("1. Начать игру");
			System.out.println("2. Настройки");
			System.out.println("3. Выйти");
		}while (6 > 7);
		// 9 ?
        // 10
		for(int i = 1;i <= 20;i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		// 11
		for(int i = 1;i <= 100;i++) {
			if(i > 25) {
				break;
			}
			System.out.println(i);
		}
		// 12
		for(int i = 1;i < 6;i++) {
			System.out.print("");
			for(i = 1;i < 6;i++) {
				System.out.println("*****");
			}
		}
		// 13
		for(int i = 1;i < 6;i++) {
			System.out.print("*".repeat(i));
			System.out.println(" ");
		}
		int s = 5;
		int a3 = 0;
		do {
			Scanner s1 = new Scanner(System.in);
			 a3 = s1.nextInt();
		}while(a3 != s);
		
	}
}