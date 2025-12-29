package homework_2;

public class Homework2 {
public static void main(String[] args) {
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
	int a = 121;
	int b = 131;
	int c = 125;
	if(a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
		if( a % 2 == 1 || b % 2 == 1 || c % 2 == 1) {
			System.out.println("Да");
		}
	}else {
		System.out.println("Нет");
	}
	//
	byte month = 4;
	switch(month) {
	case 1 -> System.out.println(31);
	case 2 -> System.out.println(29);
	case 3 -> System.out.println(31);
	case 4 -> System.out.println(30);
	case 5 -> System.out.println(31);
	case 6 -> System.out.println(30);
	case 7 -> System.out.println(31);
	case 8 -> System.out.println(31);
	case 9 -> System.out.println(30);
	case 10 -> System.out.println(31);
	case 11 -> System.out.println(30);
	case 12 -> System.out.println(31);
	default -> System.out.println("Некорректный месяц");
	};
	//
	byte age = 12;
	if(age < 13){System.out.println( "Ребёнок");}
	else if(age >= 13 && age < 18) {System.out.println("Подросток");}
	else if(age >= 18 && age < 60) {System.out.println("Взрослый");}
	else{System.out.print("Пенсионер");}
	//
	String op = "/";
	int firstnum = 20;
	int secondnum = 0;
	if(secondnum == 0) {
		System.out.println("Деление на ноль");
	}
	if(op == "+" || op == "-" || op == "/" || op == "*") {
		if(secondnum != 0) {
	switch(op) {
    case "+" -> System.out.println(firstnum += secondnum);
    case "-" -> System.out.println(firstnum -= secondnum);
    case "*" -> System.out.println(firstnum * secondnum);
    case "/" -> System.out.println(firstnum / secondnum);
    }
	}
	}if(op != "+" && op != "-" && op != "/" && op != "*") {
		System.out.println("Неизвестная операция");
	}
	//
	char letter = 'z';
	switch(letter) {
	case 'a' -> System.out.println("Гласная");
	case 'e' -> System.out.println("Гласная");
	case 'i' -> System.out.println("Гласная");
	case 'o' -> System.out.println("Гласная");
	case 'u' -> System.out.println("Гласная");
	case 'y' -> System.out.println("Гласная");
	default -> System.out.println("Согласная");
	}
	//
	byte score = 92;
	if(score < 60){System.out.println(2);}
	else if(score >= 60 && score < 75) {System.out.println(3);}
	else if(score >= 75 && score < 90) {System.out.println(4);}
	else if(score >= 90 && score < 101) {System.out.println(5);}
	else{System.out.println("Ошибка");}
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
	default -> System.out.println("Ошибка");
	};
	//
	int a1 = 3;
	int b1 = 4;
	int c1 = 3;
	if(a1 > 0 && b1 > 0 && c1 > 0){
	if(a1 + b1 > c1) {
		if(a1 == b1 && b1 == c1) {
			System.out.println("Равносторонний");
		}
		else if(a1 == b1 || b1 == c1 || a1 == c1) {
			System.out.println("Равнобедренный");
		}
		else{
			System.out.println("Разносторонний");
		}		
	}else {
		System.out.println("Не треугольник");
	}
	}
	//
	int year = 1;
	if(year % 400 == 0) {
		if(year % 100 > 0) {
			System.out.println("Високосный");
		}
	}else if(year % 4 == 0) {
		if(year % 100 > 0) {
			System.out.println("Високосный");
	}
	}
	else if(year < 0) {
		System.out.println("Ошибка");
	}else {
		System.out.println("Обычный");
	}
int sm = 0;
while(sm < 3000) {
	sm++;
	System.out.println(sm  + ".Учеба давит энштейны манят");
}
}   
}