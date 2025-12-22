package classwork_1;

public class Classwork_1 {
	public static void main(String[] args) {
		byte age = 18;
		if (age >= 18) {
			System.out.println("Вы совершеннолетний");
		}
		;
		//
		byte temperature = 0;
		if (temperature < 0) {
			System.out.println("Холодно, одевайтесь теплее");
		} else {
			System.out.println("Погода нормальная");
		}
		;
		//
		byte mark = 4;
		if (mark == 5) {
			System.out.println("Отлично");
		} else if (mark == 4) {
			System.out.println("Хорошо");
		} else if (mark == 3) {
			System.out.println("Удовлетворительно");
		} else if (mark == 2) {
			System.out.println("Неудовлетворительно");
		} else {
			System.out.println("Некорректная оценка");
		}
		;
		//
		int num = 363;
		if (num > 0 & num % 3 == 0) {
			System.out.println("Число положительное и кратно 3");
		} else {
			System.out.println("Условие не выполнено");
		}
		;
		//
		
		byte dayofweek = 2;
		switch(dayofweek) {
		case 1 -> System.out.println("Понедельник");
		case 2 -> System.out.println("Вторник");
		case 3 -> System.out.println("Среда");
		case 4 -> System.out.println("Четверг");
		case 5 -> System.out.println("Пятница");
		case 6 -> System.out.println("Суббота");
		case 7 -> System.out.println("Воскресенье");
		default -> System.out.println("Некорректный день");
		};
		//
		byte month = 2;
		switch(month) {
		case 1 -> System.out.println("Зима");
		case 2 -> System.out.println("Зима");
		case 3 -> System.out.println("Весна");
		case 4 -> System.out.println("Весна");
		case 5 -> System.out.println("Весна");
		case 6 -> System.out.println("Лето");
		case 7 -> System.out.println("Лето");
		case 8 -> System.out.println("Лето");
		case 9 -> System.out.println("Осень");
		case 10 -> System.out.println("Осень");
		case 11 -> System.out.println("Осень");
		case 12 -> System.out.println("Зима");
		default -> System.out.println("Некорректный месяц");
		};
		//
		byte age2 = 12;
		if(age < 13){System.out.print( "Ребёнок");}
		else if(age >= 13 && age < 18) {System.out.println("Подросток");}
		else if(age >= 18 && age < 65) {System.out.println("Взрослый");}
		else{System.out.print("Пенсионер");}
		//
		int score = 890;
		int lives = 0;
		if(score > 1000 && lives > 0) {System.out.println("Поздравляем! Вы прошли уровень!");}
		else if(score > 1000 && lives == 0) {System.out.println("Отличный счёт, но жизни закончились");}		
		else {System.out.println("Попробуйте ещё раз");};
		//
		double a = 39;
		double b = 29;
		char op ='/';
		switch(op) {
		case '+' -> System.out.println( a + b);
		case '-' -> System.out.println( a - b);
		case '*' -> System.out.println( a * b);
		case '/' -> System.out.println( a / b);
		};
	}
}