package homework_10;

public class Cubik {
	public static void main(String[] args) {
		long dice = 0;
        int point = 0;
        int allpoints = 0;
        int kolvobroskov = 15;
        System.out.println("Игра начинается!");
        for(int i = 0; i < kolvobroskov; i ++) {
        	dice =  Math.round(Math.random() * 5 + 1);
        	allpoints += dice;
            System.out.println("Бросок номер :" + i + " Очки :" + dice);
        	if(i == 1)System.out.println("Очень плохо...");
        	if(i == 6)System.out.println("Классно! Шестёрка!");
        }	
        System.out.println("Всего набрано очков :" + allpoints);
   	}	
}
