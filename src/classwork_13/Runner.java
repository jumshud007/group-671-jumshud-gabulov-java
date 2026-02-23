package classwork_13;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Runner {
	public static void main(String[] args) {
		// 1
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a % 2 == 0) {
			System.out.println("Ноль");
		} else {
			System.out.println("Нечётное");
		}
		// 2
		Scanner s2 = new Scanner(System.in);
		int a2 = s.nextInt();
		if (a2 > 89 && a2 < 101) {
			System.out.println("отлично");
		}
		if (a2 > 74 && a2 < 90) {
			System.out.println("хорошо");
		}
		if (a2 > 59 && a2 < 75) {
			System.out.println("удовлетворительно");
		}
		if (a2 > 100 && a < 0) {
			System.out.println("Некорректный балл");
		}
		if (a2 < 60) {
			System.out.println("неудовлетворительно");
		}
		// 3
		Scanner s3 = new Scanner(System.in);
		int a3 = s.nextInt();
		Scanner s4 = new Scanner(System.in);
		int a4 = s.nextInt();
		Scanner s5 = new Scanner(System.in);
		int a5 = s.nextInt();
		int[] array = { a3, a4, a5 };
		Arrays.sort(array);
		if (array[0] < array[1] + array[2]) {
			System.out.println("Треугольник существует");
		} else {
			System.out.println("Треугольник не существует");
			// 4
			Scanner s6 = new Scanner(System.in);
			int a6 = s.nextInt();
			if (a6 >= 5000) {
				System.out.println("скидка 15%" + "i eto ravno :" + a6 / 100 * 15);
			}
			if (a6 >= 2000) {
				System.out.println("скидка 10%" + "i eto ravno :" + a6 / 100 * 10);
			}
			if (a6 >= 1000) {
				System.out.println("скидка 5%" + "i eto ravno :" + a6 / 100 * 5);
			} else {
				System.out.println("без скидки");
				// 5
				Scanner s7 = new Scanner(System.in);
				int a7 = s.nextInt();
				Scanner s8 = new Scanner(System.in);
				int a8 = s.nextInt();
				for(int i = 1; i <= a8;i++) {
					System.out.print("*".repeat(a7));
				}
			     // 6
				Scanner s9 = new Scanner(System.in);
				int a9 = s.nextInt();
				for (byte i = 1; i <= 10; i++) {
					System.out.println(a9 + " * " + i + " = " + i * a9);
				}
				// 7
				Scanner s10 = new Scanner(System.in);
				int a10 = s.nextInt();
				int sum = 0;
				int kol_vo = 0;
				for (int i = 1; i <= a10; i++) {
					if (i % 2 == 1) {
						continue;
					}
					kol_vo++;
					sum += i;
				}
				// 8
				Scanner s11 = new Scanner(System.in);
				int a11 = s.nextInt();
				if (a11 <= 20 && a11 >= 1) {
					int proiz = 1;
					for (int i = 1; i <= a11; i++) {
						proiz *= i;
					}
				} else {
					System.out.println("Слишком большое число");
				}
				// 9
				Rexctangle rectangle1 = new Rexctangle(1.2, 1.3);
				rectangle1.getArea();
				rectangle1.getPerimetr();
				rectangle1.printInfo();
				Rexctangle rectangle2 = new Rexctangle(1.2, 1.3);
				rectangle2.getArea();
				rectangle2.getPerimetr();
				rectangle2.printInfo();
			}
			// 10
			Student student1 = new Student("OLya", 9, 87);
			Student student2 = new Student("Sava", 10, 97);
			Student student3 = new Student("Jumshud", 13, 87);
			Student student4 = new Student("Hafiz", 12, 98);
			student1.excellent(false);
			student2.excellent(false);
			student3.excellent(false);
			student4.excellent(false);
			Student[] array1 = { student1, student2, student3, student4 };
			
			for (int i = 0; i < array1.length; i++) {
				if(student1.i == true) {System.out.println(array1[i]);}
			}
			// 11
		}
	}
}