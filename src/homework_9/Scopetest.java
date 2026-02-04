package homework_9;

public class Scopetest {
	public void scope() {
	int x = 10;
	
	if (x > 5) {
	    int y = x * 2;
	    System.out.println("y = " + y);
	}
	System.out.println("x = " + x);
	System.out.println("y = ???"); // Попытка использовать y здесь;
}
}
