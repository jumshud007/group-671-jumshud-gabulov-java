package homework_10;

public class Figures {
     public static void skv(double a) {System.out.println(Math.pow(a, a));}
     public static void spramuqol(double a, double b) {System.out.println(a * b);}
     public static void main(String[] args) {
		int[] skv = {5, 8, 3, 10, 6};
		int max = 0;
		for(int i = 0; i < skv.length; i++) {
			System.out.println("");
			System.out.println("Площадь квадрата = " + skv[i] * skv[i]);
			if(i == 4) continue;
			max = Math.max(skv[i] * skv[i] , skv[i + 1] * skv[i + 1]);
		}
	    System.out.println( "Самая большая площадь: " + max);
 		
		int[] spramuqol = { 4,6, 7,3, 9,2, 5,5};
		for(int i = 0; i < spramuqol.length; i += 2) {
			System.out.println("");
			System.out.println("Площадь прямоугольника = " + spramuqol[i] * spramuqol[i + 1]);
			if(i > 5) continue;
			max = Math.max(spramuqol[i] * spramuqol[i + 1] , spramuqol[i + 2] * spramuqol[i + 3]);
		}
		  System.out.println( "Самая большая площадь: " + max);
	 		
	}
}
