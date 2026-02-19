package classwork_12;

public class RobotCleaner {
    String name;
    int battery = 100;
    boolean isworking = falseF;
    public RobotCleaner(String name) {
    	this.name = name;
    }
    public void start() {
    	if(battery > 10) {isworking = true;System.out.println("Я начал убирать!");}
    }
    public void stop() {
    	 isworking = false;
    	 System.out.println("Уборка закончена");
    }
    public void charge() {battery = 100;System.out.println("Полная зарядка!");}
}
