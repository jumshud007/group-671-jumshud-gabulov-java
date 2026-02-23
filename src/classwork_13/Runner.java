package classwork_13;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Runner {
	public static void main(String[] args) {
        // 1
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a % 2 == 0) {
			System.out.println("Ноль");
		} else {
			System.out.println("Нечётное");
		}
		// 2
		Scanner s2 = new Scanner(System.in);
		int a2 = s.nextInt();
	    if(a2 > 89 && a2 < 101){System.out.println("отлично");}
	    if(a2 > 74 && a2 < 90) {System.out.println("хорошо");}
	    if(a2 > 59 && a2 < 75) {System.out.println("удовлетворительно");}
	    if(a2 > 100 && a < 0) {System.out.println("Некорректный балл");}
	    if(a2 < 60) {System.out.println("неудовлетворительно");}
	    // 3
	    Scanner s3 = new Scanner(System.in);
		int a3 = s.nextInt();
		Scanner s4 = new Scanner(System.in);
		int a4 = s.nextInt();
		Scanner s5 = new Scanner(System.in);
		int a5 = s.nextInt();
	    int[] array = {a3, a4, a5};
	    Arrays.sort(array);
	    if(array[0] < array[1] + array[2]) {System.out.println("Треугольник существует");} else {
		System.out.println("Треугольник не существует");
       // 4
	   Scanner s6 = new Scanner(System.in);
	   int a6 = s.nextInt();
	    if(a6 >= 5000) {
			System.out.println("скидка 15%");
		}
	    if(a6 >= 2000) {
			System.out.println("скидка 10%");
		}
	    if(a6 >= 1000) {
			System.out.println("скидка 5%");
		} else {
			System.out.println("без скидки");
     // 5
	    Scanner s7 = new Scanner(System.in);
		int a7 = s.nextInt();
		Scanner s8 = new Scanner(System.in);
		int a8 = s.nextInt();
		System.out.print("*".repeat(a7));
		int aa = a8 - 1;
		System.out.print("*".repeat(a7));
		System.out.println("*".repeat(aa));
     // 6
		Scanner s9 = new Scanner(System.in);
		int a9 = s.nextInt();
		for(byte i = 1 ;i <= 10;i++) {
			 System.out.println(a9 + " * " + i +" = " + i * a9);
		}
     // 7
		Scanner s10 = new Scanner(System.in);
		int a10 = s.nextInt();
		int sum = 0;
		int kol_vo = 0;
        for(int i = 1;i <= a10;i++) {
        	if(i % 2 == 1) {
				continue;
			}
        	kol_vo ++;
        	sum+= i;
        }
     // 8
        Scanner s11 = new Scanner(System.in);
		int a11 = s.nextInt();
		if(a11 <= 20 && a11 >= 1) {
			int proiz = 1;  
			for(int i = 1;i <= a11;i++) {
				  proiz *= i;
			  }
		} else {
			System.out.println("Слишком большое число");
//	8. **Факториал** (два варианта)  
//	   а) Введите число n (1–15). Выведите n!  
//	   б) *То же самое*, но если n > 20 — выведите «Слишком большое число»
//
//	### Уровень 2–3: class
//
//	9. **Простой класс Rectangle**  
//	   Создайте класс `Rectangle` с двумя полями:  
//	   `double width`, `double height`  
//
//	   Добавьте:  
//	   - конструктор с двумя параметрами  
//	   - метод `double getArea()`  
//	   - метод `double getPerimeter()`  
//	   - метод `void printInfo()` → выводит ширину, высоту, площадь и периметр  
//
//	   В `main` создайте 2 прямоугольника и выведите информацию о каждом.
//
//	10. **Класс Student**  
//	    Поля:  
//	    - String name  
//	    - int age  
//	    - double averageGrade  
//
//	    Методы:  
//	    - конструктор со всеми полями  
//	    - `boolean isExcellent()` → true, если средний балл ≥ 90  
//	    - `void print()` → красиво выводит все данные + «Отличник» / «Обычный студент»
//
//	    В main создайте массив из 3–4 студентов и выведите только отличников.
//
//	11. **Класс Time (часы)**  
//	    Поля: int hours, int minutes (0–23 и 0–59)  
//
//	    Методы:  
//	    - конструктор(int h, int m) — если значения некорректны, ставить 0:0  
//	    - void addMinutes(int min) — прибавляет минуты (с переходом через час и сутки)  
//	    - String toString() → "14:05" или "09:30"
//
//	    В main создайте время 23:50, прибавьте 25 минут → должно получиться 00:15
//
//	12. **Комбинированное задание (if + for + class)**  
//	    Создайте класс `TemperatureDay` с полями:  
//	    - int dayNumber (1–31)  
//	    - double temperature  
//
//	    В main:  
//	    - создайте массив из 7 объектов TemperatureDay  
//	    - заполните случайными температурами от -15 до +35  
//	    - найдите и выведите:  
//	      - самый тёплый день  
//	      - самый холодный день  
//	      - среднюю температуру за неделю  
//	      - количество дней с температурой > 20 °C
//
		}
		}
		}
}
}