package homework_11;

public class Game {
      public static void main(String[] args) {
		double secret = Math.round(Math.random() * 99 + 1);
	    int i = 0;  
		for(int b = 1;b < 11;b++) {
		  double guess = Math.round(Math.random() * 99 + 1);
		  System.out.println("Popitka " + b + " Cislo tvoyo :" + guess);
		  if(guess == secret) {
	 	  i += 100; 
	 	  System.out.println("Угадал cislo bilo" + guess);
          break;
	 	  }
	 	  if(guess > secret) {
			System.out.println("Слишком большое");
		  }
	 	  if(guess < secret) {System.out.println( "Слишком маленькое");}
	      }
           if(i == 0) {System.out.println("Не повезло cislo bilo : " + secret);}
}
}