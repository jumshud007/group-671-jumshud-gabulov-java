package classwork_24;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		// 1
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		// 2
		for (byte z = 1; z <= 9; z++) {
			for (byte k = 1; k <= 9; k++) {
				System.out.println(z + " * " + k + " = " + z * k);
			}
		}
		// 3
		int sum1 = 0;
		int i = 1;
		while (i < 101) {
			sum1 += i;
			i++;
		}
		// 4
		for (int a = 11; a > 0; a--) {
			System.out.println(a);
		}
		// 5
		int i3 = 10;
		do {
			System.out.println();
			if (i3 == 1) {
				System.out.println("Старт!");
			}
			i3--;
		} while (i3 != 0);
		// 6
		{
			for (int a = 1; a < 6; a++) {
				for (int j = 1; j <= a; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		// 7
		for (int a = 1; a < 31; a++) {
			if (a % 2 == 1) {
				continue;
			}
			System.out.println(a);
		}
		// 8
		double g = Math.round(Math.random() * 20) + 1;
		int f = 0;
		do {
			Scanner s = new Scanner(System.in);
			f = s.nextInt();
			if (f < g) {
				System.out.println("Меньше");
			}
			if (f > g) {
				System.out.println("Больше");
			}
		} while (f != g);
		// 9
		int num = 2;
		if (num % 2 == 0) {
			System.out.println("чётнoe");
		} else {
			System.out.println("нечётнoe");
		}
		// 10
		int d = 0;
		int q = 9;
		int h = 10;
		if (d > q && d > h) {
			System.out.println("max :" + d);
		} else if (q > d && q > h) {
			System.out.println("max :" + q);
		} else if (h > q && h > d) {
			System.out.println("max :" + h);
		}
		// 11
		int score = 82;
		if (score >= 90 && score <= 100) {
			System.out.println("Отлично");
		}
		if (score >= 70 && score <= 89) {
			System.out.println("Хорошо");
		}
		if (score >= 50 && score <= 69) {
			System.out.println("Удовлетворительно");
		}
		if (score >= 0 && score <= 49) {
			System.out.println("Не сдал");
		} else {
			System.out.println("Некорректный балл");
		}
		// 12
		Scanner s1 = new Scanner(System.in);
		int f1 = s1.nextInt();
		Scanner s3 = new Scanner(System.in);
		int f3 = s3.nextInt();
		Scanner s2 = new Scanner(System.in);
		String op = s2.next();
		switch (op) {
		case "+" -> System.out.println(f1 + f3);
		case "-" -> System.out.println(f1 - f3);
		case "*" -> System.out.println(f1 * f3);
		case "/" -> System.out.println(f3 == 0 ? "Deleniye na nol" : f1 / f3);
		}
		// 13
		Scanner sp = new Scanner(System.in);
		int fp = sp.nextInt();
		if (fp % 4 == 0 && fp % 4 > 0) {
			System.out.println("Visokosniy");
		}
		// 14
		Scanner h1 = new Scanner(System.in);
		int a1 = h1.nextInt();
		Scanner q1 = new Scanner(System.in);
		int r1 = q1.nextInt();
		Scanner l1 = new Scanner(System.in);
		int v1 = l1.nextInt();
		if (a1 < r1 + v1 && r1 < a1 + v1 && v1 < a1 + r1) {
			if (a1 == r1 && r1 == v1) {
				System.out.println("равносторонний");
			} else if (a1 == r1 || a1 == v1 || r1 == v1) {
				System.out.println("равнобедренный");
			} else {
				System.out.println("разносторонний");
			}

		}
		// 17
		int[] array = { 7, 9, 19, 10, 67 };
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		// 19
		int[] array2 = { 7, 9, 19, 10, 67, 81, 98, 100, 27 };
		int sum2 = 0;
		int aripmetic2 = 0;
		for (int a : array2) {
			sum2 += a;
			aripmetic2 += a;
		}
		System.out.println(sum2);
		System.out.println(aripmetic2 / array2.length);
		// 20
		int[] array4 = new int[6];
		int sm = 0;
		int[] array3 = { 7, 9, 19, 10, 67, 16 };
		for (int i4 = 6; i4 > -1; i4--) {
			array4[i] = array3[sm];
			sm++;
		}
		// 24
		Student student1 = new Student("Jum", 12, 89);
		Student student2 = new Student("Nur", 62, 99);
		System.out.println("name :" + student1.name + "; age :" + student1.age + "; Score :" + student1.score);
		System.out.println("name :" + student2.name + "; age :" + student2.age + "; Score :" + student2.score);
		// 22
		int[] array5 = { 1, 6, 3, 2, 54, 7, 4 };
	    System.out.println(Arrays.toString(array5));
	    Arrays.sort(array5);
	    System.out.println(Arrays.toString(array5));
	}
}