package homework_3;

public class Homework1 {
  public static void main(String[] args) {
	 for(byte i = 0 ;i < 10 ;i++ ) {
		System.out.println("Привет, я учу Java!");
	 }
	 //
	 for(byte i = 1 ;i <= 20 ;i++ ) {
		 System.out.println(i);
	 }
	 //
	 for(byte i = 10; i >= 0;i --) {
		 if(i >= 1) {System.out.println(i);}
		 else {
		 System.out.println("Пуск!");
	 }
     }
	 //
	 for(byte i = 1 ;i <= 10;i++) {
		 System.out.println(5 + " * " + i +" = " + i * 5);
	 }
//	 //
//	 for(;;) {
//		 System.out.println("Я люблю программировать!");
//	 }
	 //
	 byte j = 1;
	 
	 String[] fruits = {"яблоко", "банан", "груша", "апельсин" ,"киви"};
	
	 String[] animals = {"кот", "собака", "хомяк", "попугай", "кролик"};  

	 for(byte i = 0; i < animals.length;i++) {
		 System.out.println( "Животное "+ j++ + ":" + " " + fruits[i]);
	 }
	 //
     for(byte i = 0;i < fruits.length; i++) {
    	 if(i == fruits.length -1)System.out.println(fruits[i]);
     } // Without for
     System.out.println(fruits[4]);
     //
     int[] pies = {1, 0, 1, 1, 0, 1, 0, 1};
     for(byte i = 0;i < pies.length; i++) {
    	 if(pies[i] != 1) continue;
    	 System.out.println("Пирожок готов!");
     }
     //
     int number = 11;  
     do {
    	 System.out.println(number++);
     } while(number <= 10);
     //
     for(byte i = 1;i <= 20;i++) {
    	 if(i % 2 == 0) continue;
    	 System.out.println("Нечётное число: " + i);
     }
  }
}