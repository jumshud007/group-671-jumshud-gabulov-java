package homework_11;

public class Kvadrati {
   public static void main(String[] args) {
	  double sum = 0;
	   for(int i = 1; i < 12; i++) {
		double s = Math.round(Math.random() * 19 + 1);
	    System.out.println("Number :" + s);
		double v = Math.pow(s, 2);
	    sum += v;  
	    System.out.println("Kvadrat :" + v);
	    if(v > 100) {
			System.out.println("Большое число!");
		}
	}
	   System.out.println("Summa :" + sum);
	   System.out.println("Summa okruqlennaya :" + Math.round(sum));
}
}
