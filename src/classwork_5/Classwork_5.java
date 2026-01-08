package classwork_5;

import java.util.Iterator;

public class Classwork_5 {
public static void main(String[] args) {
	// 1
	for(int i = 1;i <= 10; i++) {
		System.out.println(i);
	}
	// 2
	for(int i = 10;i >= 0; i--) {
		System.out.println(i);
		if(i == 0) {System.out.println("Поехали!");}
	}
    // 3
	for(byte i = 1;i <= 20;i++) {
	    	 if(i % 2 == 0) System.out.println(i);
	}
	// 4
	int sum = 0;
	for(byte i = 0;i <= 50;i++) {
		sum += i;
	}
	System.out.println(sum);
    // 5
	for(byte i = 1 ;i <= 10;i++) {
		 System.out.println(7 + " * " + i +" = " + i * 7);
	}
	// 6
	for(byte i = 1 ;i <= 30;i++) {
	if(i % 3 == 0 && i % 5 == 0) {
		System.out.println(i + "-КОРЕЙКА! (делится на всё)");
	}else if(i % 5 == 0 && i % 3 != 0) {
		System.out.println(i + "-делится на 5");
	}else if(i % 3 == 0 && i % 5 != 0) {
		System.out.println(i + "-делится на 3");
	}
	}
}  
}
