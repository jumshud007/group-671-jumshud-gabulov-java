package classwork_10;

import java.util.Scanner;

public class Classwork_19 {
   public static void main(String[] args) {
	// 1
//	System.out.println(123);
//	Scanner s = new Scanner(System.in);
//	int a = s.nextInt();
//	if(a % 2 == 0) {
//		System.out.println("Чётное");
//	} else {
//		System.out.println("Нечётное");
//	}
//	// 2
//	Scanner s2 = new Scanner(System.in);
//	int a2 = s2.nextInt();
//	if(a2 < 0) {
//		System.out.println("Отрицательное");
//	} else if(a2 > 0) {
//		System.out.println("Положительное");
//	} else {System.out.println("Ноль");}
//	// 3
//	for(byte i = 1 ;i <= 10;i++) {
//		 System.out.println(5 + " * " + i +" = " + i * 5);
//	}
//	// 4
//	int sum = 0;
//	for(int i = 0; i <= 100; i++) {
//		sum += i;
//	}
//	System.out.println("Summa :" + sum);
//	// 5
//	int a3 = 0;
//	int i = 7;
//    do {
//    	Scanner s3 = new Scanner(System.in);
//    	a3 = s3.nextInt();		
//    }while(a3 != i);
//    // 6
//    int b = 0;
//    for(int i3 = 0; i3 <= 10;i3++) {
//    	Scanner s4 = new Scanner(System.in);
//    	int a4 = s4.nextInt();	
//    	if(a4 % 2 == 0) {
//			b++;
//		}
//    }
//    // 8
//	Scanner s6 = new Scanner(System.in);
//	int a6 = s6.nextInt();		
//	Scanner s7 = new Scanner(System.in);
//	int a7 = s7.nextInt();		
//	Scanner s8 = new Scanner(System.in);
//	int a8 = s8.nextInt();		
//	Scanner s9 = new Scanner(System.in);
//	int a9 = s9.nextInt();		
//	Scanner s10 = new Scanner(System.in);
//	int a10 = s10.nextInt();
//	int random = 0;
//	random = Math.max(a6, a7);
//	random = Math.max(a8, a9);
//	random = Math.max(a9, a10);
//    System.out.println(random);
//    // 9
//	Scanner s1 = new Scanner(System.in);
//	int a11 = s1.nextInt();
//	Scanner s0 = new Scanner(System.in);
//	int a0 = s1.nextInt();
//	do {
//	System.out.print("*");
//	a11 --;
//	} while(a11 == 0);
//	do {
//	System.out.println("*");
//	a0 --;
//	} while(a0 == 1);
//    // 11
//    for(int i3 = 10; i3 <= 1;i3--) {
//    	System.out.println(i3);
//    }
//    // 12
//    int sum15 = 0;
//    for(int i9 = 0; i9<= 50; i9++) {
//    	if( i9 % 2 == 1) {
//			sum15 += i9;
//		}
//    }
//    // 15
//	Scanner s3 = new Scanner(System.in);
//	int a13 = s3.nextInt();
//     if(a13 < 13) {
//		System.out.println("Ребёнок");
//	 } else if(a13 > 12 && a13 < 18) {
//		System.out.println("Подросток");
//	 } else {System.out.println("Взрослый");}
//     // 16
     int sum19 = 0;
     System.out.println(1);
     int num = 1;
     do {
    	 Scanner s12 = new Scanner(System.in);
    	 int a14 = s12.nextInt();
    	 sum19 += a14;    	 
      	 num = a14;
      	 if(num % 10 == 0) {
			break;
		 }
     } while(num != 0); 
     
   }
}
