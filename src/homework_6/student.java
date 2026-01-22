package homework_6;

import java.util.Arrays;

public class student {

    String name;
    int age;
    double averageGrade;

    public student(String name, int age, double averageGrade) {
    this.name = name;
    this.age = age;
    this.averageGrade = averageGrade;
    }
     
    public void printInfo() {
    	System.out.println("Name :" + name +"," + " Age :" + age + "," + " AverageGrade :" + averageGrade + "." );
    }
	public int calculate(int a, int b) {
		return a + b; 
	}
	public void average(double ...numbers) {
		int sum = 0;
		Arrays.toString(numbers);
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			System.out.println(sum / numbers.length);
		}
	}
	public void printMax(int ...values) {
		Arrays.sort(values);
		System.out.println(values[values.length - 1]);
	};
	// 3
	public void printIn1(String text) {
		System.out.println("String value :" + text);
	}
	public void printIn2(int number) {
		System.out.println("Int value :" + number);
	}
    public void printIn3(double value, final String notunit) {
    	System.out.println("Double value :" + value +"Final string value :" + notunit);
    }
}
