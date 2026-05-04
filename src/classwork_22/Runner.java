package classwork_22;

public class Runner {
	public static void main(String[] args) {
		// 1
		int number1 = -7;
		if (number1 > 0) {
			System.out.println("Число положительное");
		}
		if (number1 < 0) {
			System.out.println("Число отрицательное");
		} else {
			System.out.println("Число равно нулю");
		}
		// 2
		int number2 = 14;
		if (number2 % 2 == 0) {
			System.out.println("Чётное число");
		} else {
			System.out.println("Нечётное число");
		}
		// 3
		int a = 25;
		int b = 31;
		if (a > b) {
			System.out.println(a);
		}
		if (a < b) {
			System.out.println(b);
		} else {
			System.out.println("Числа равны");
		}
		// 4
		int age = 17;
		if (age >= 18) {
			System.out.println(" Доступ разрешён");
		} else {
			System.out.println("Доступ запрещён");
			// 5
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
		}
		// 6
		String login = "admin";
		String password = "12345";
		if("admin".equals(login) && "12345".equals(password)) {System.out.println("Вход выполнен");}
		else {System.out.println("Ошибка входа");}
		// 7
		int temperature = 32;
		if(temperature < 0) {System.out.println("Очень холодно");}
		if(temperature >= 0 && temperature < 16) {System.out.println("Прохладно");}
		if(temperature < 15 && temperature < 31) {System.out.println("Тепло");} else {
			System.out.println("Жарко");
		}
		// 8
		int day = 3;
		switch(day) {
		case 1 -> System.out.println("Понедельник");
		case 2 -> System.out.println("Вторник");
		case 3 -> System.out.println("Среда");
		case 4 -> System.out.println("Четверг");
		case 5 -> System.out.println("Пятница");
		case 6 -> System.out.println("Суббота");
		case 7 -> System.out.println(" Воскресенье");
		default -> System.out.println("Неправильная дата");
		}
		// 9
		int a2 = 20;
		int b2 = 5;
		char operator = '*';
		switch (operator) {
		case '*':
			System.out.println(a2 * b2);
			break;
		case '+':
			System.out.println(a2 + b2);
			break;
		case '-':
			System.out.println(a2 - b2);
			break;
		case '/':
			System.out.println(a2 / b2);
			break;
		default:
			break;
		}
		// 10
		int number = 55;
		if(number > 9 && number < 101) {System.out.println("Число входит в диапазон");} else {
			System.out.println(" Число вне диапазона");
		}
	}
}
