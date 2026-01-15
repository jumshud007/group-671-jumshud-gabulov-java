package Classwork_6;

import java.util.Arrays;
import java.util.Iterator;

public class Classwork_6 {
public static void main(String[] args) {
	// 1
	int[] array1 = {10, 20, 30, 40, 50};
	
	for(byte i = 0; i < array1.length; i++) {
		System.out.println(array1[i]);
	}
	// 2
	int[] array2 = {11, 20, 33, 40, 51, 56, 99, 90};
	
	for(byte i = 0; i < array2.length; i++) {
	if(array2[i] % 2 == 1) continue;
		System.out.println(array2[i]);
	}
	// 3
	int[] array3 = {11, 20, 33, 45, 56, 1234};
	
	System.out.println(array3[0] += array3[1] += array3[2]);
	// OR
	int sum = 0;
	for(byte i = 0; i < 1; i++) {
	sum += array3[i];
	}

	System.out.println("Sum : " + sum);
}
}
