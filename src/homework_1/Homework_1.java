package homework_1;

public class Homework_1 {
	public static void main(String[] args) {
		byte count = 10;
	    count++;
	    ++count;
	    count--;
	    --count;
	    	System.out.println(count);
	  //
	    int num = 0;
	    if(num > 0) {System.out.println("Положительное");}
	    else if( num == 0) {System.out.println("Ноль");}
	    else {System.out.println("Отрицательное");}
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
	}
	//
	int a = 6;
	int b = 1;
	
	if(a > 0 && b != 0 && a / b > 5) {
	System.out.println("Условие выполнено");
	}else {
		System.out.println("Условие невыполнено");
	}

int sum = 0;
for(byte i = 0;i <= 50;i++) {
if(i % 2 == 0) continue;
	sum += i;
}
int summ = 0;
System.out.println(sum);
for(byte i = 0;i <= 20;i++ ){
if(i % 3 != 0) continue;
summ += i; 
}
System.out.println(summ);

for(byte i = 1; i <= 5;i++ ){ for(byte j = 1; j <= 5; j++) {
System.out.println(i * j);	
}} 

	for( byte i = 1; i <= 5;i++ ) {
		for(byte j = 1; j <= 5;j++) {
			if(i * j != 12) continue;
			else {System.out.println("Найдено: i=j"); i +=5;j +=5;}
			
		}
	}
	int[] numbers = {3, 7, 2, 9, 4};
	for(int number : numbers) {
		if(number > numbers[1] && number > numbers[2] && number > numbers[3] && number > numbers[4] && number > numbers[0]) {
			System.out.println("Max is ");
		}
		if(number < numbers[1] && number < numbers[2] && number < numbers[3] && number < numbers[4] && number < numbers[0]) {
			System.out.println("Max is ");
		}
	};
    int n = 2;
    for(int i = 0;i > n;i++) {

        String some = "*";
    	some += "*";
    	System.out.println(some);
    }
	
}
}