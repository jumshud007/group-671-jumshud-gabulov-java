package classwork_20;

public class Student {
	String name;
	int age;
	int score;
    public void getStatus() {
    	if(score > 89) {
			System.out.println("Отлично");
		} else if(score > 59) {
			System.out.println("Хорошо");
		} else if(score > 29) {
			System.out.println("Удовлетворительно");
		} else {
			System.out.println("Неудовлетворительно");
		}
    }
}
