package classwork_2;

public class Classwork2 {
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
        String op = "*";
        switch(op) {
        case "+" -> System.out.println("Сложение");
        case "-" -> System.out.println("Вычитание");
        case "*" -> System.out.println("Умножение");
        case "/" -> System.out.println("Деление");
        }
        //
        int sum = 700;
        if(sum >= 1000) {System.out.println("скидка 10%, выведите новую сумму.");}
        else if( sum >= 500 ) {System.out.println("скидка 5%, выведите новую сумму.");}
        else {System.out.println("Без скидки");}
        //
        int error = 403;
        switch(error) {
        case 404 -> System.out.println("Страница не найдена");
        case 500 -> System.out.println("Ошибка сервера");
        case 403 -> System.out.println("Доступ запрещён");
        default -> System.out.println("Неизвестная ошибка");
        }
        
        
}
}
