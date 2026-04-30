package homework_15;

public class Runner {
	public static void main(String[] args) {
		// 1
		int max = Integer.MAX_VALUE;
		max = max + 1;
		// Изза того что мы превысим максимальное значение мах будет его минимальным
		// значением(Overflow)
		// 2
		// int a = 1/0; // / by zero
		double b = 1.0 / 0.0;
		System.out.println(b); // Infinity
		// 3
//		try {
//			System.out.println(Math.addExact(Integer.MAX_VALUE, 1));
//		} catch (ArithmeticException e) {
//			throw new IllegalStateException("Overflow!", e);
//		}
		int a=100000, b1=100000;
		System.out.println(a * b);
		System.out.println(a * b);
		double nan = 0.0/0.0;
		System.out.println(nan == nan);
		System.out.println(Double.isNaN(nan));
		// second tasks
		// 2
		//Код: int a=5; int b=a; b++; System.out.println(a); System.out.println(b); Объясните вывод словами про копирование.
	    // сначала а приравнивают пяти потом б приравнивают а и прибавляют к нему 1 выведится 5 и 6
	    // 3
		StringBuilder sb1 = new StringBuilder("A"); StringBuilder sb2 = sb1; sb2.append("B");
        System.out.println(sb1);	
        // они оба StringBuilder когда одно значение изменяют другое тоже изменяется
        // 4
        System.out.println(("a"+"b" == "ab"));// разницы нет просто в первом мы сначала сложили строки и еще грамотнее использовать equals чем ==
        System.out.println("ab".equals("ab"));
	}
}
