package classwork_23;

public class Runner {
	public static void main(String[] args) {
		// 1
		for (int i = 1; i < 26; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		// 2
		int number = 58342;
		int num = 0;
		do {
			num++;
			number /= 10;
		} while (number / 10 > 0);
		num++;
		System.out.println(num);

		// 3
		int sum = 0;
		for (int i = 1; i < 551; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		// 4
		int result = 2;
		for (int i = 0; i < 8; i++) {
			result *= 2;
		}
		// 5
	    int number2 = 0;
		int[] array = { 4, 8, 15, 2, 99, 17 };
		for (int a = 0; a < array.length; a++) {
        if(array[a] > number2) {
			number2 = array[a];
		}
		}
		// 6
		int number3 = 4567;
		int b = 0;
		int sum2 = 0;
		do {
			b = number2 % 10;
			sum2 += b;
			number2 /= 10;
		}while(number2 != 0);
		// 7
		for(int i = 1;i < 31; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			}
			}
		// 8
		for(int i = 0;i < 11;i++) {
			System.out.println(i + " -> " + i * i);}	
		
	    // 9
	    for(int i = 1;i < 6;i++) {
	    	for(int j = 1;j <= i;j++) {
	    	System.out.print(j);
	    	}
	    	System.out.println("");
	    }
	    for(int i = 1;i < 6;i++) {
	    	for(int j = 5;j >= i;j--) {
	    	System.out.print(j);
	    	}
	    	System.out.println("");
	    }
	    // 10
	    for(int i = 0;i < 4;i++) {
	        if(i % 2 == 1 ) {System.out.print(" ");}
	 	    	System.out.println("# # # #");
	    }
	   
	}			
	}