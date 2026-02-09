package homework_10;

public class Game {
  public static void main(String[] args) {
	int[] balls = { 120, 85, 200, 95, 150, 60, 175, 110};
	int worsenum = balls[1];
	int bestnum = balls[1];
	for(int i = 1; i < balls.length; i++) {
		worsenum = Math.min(balls[i], worsenum); 
		bestnum = Math.max(balls[i], bestnum); 
	}
	System.out.println("Худший результат: " + worsenum);
	System.out.println("Лудший результат: " + bestnum);
	if(bestnum - worsenum > 100) System.out.println("Очень большая разница!");
}
}
