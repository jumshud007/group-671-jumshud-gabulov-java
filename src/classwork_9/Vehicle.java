package classwork_9;

public class Vehicle {
    String model;
    int motor;
    int yearcreated;
    public Vehicle(String model,int motor,int yearcreated) {
    	this.model = model;
    	this.motor = motor;
    	this.yearcreated = yearcreated;
    }
    
    public void drive() {
    	System.out.println("Driving");
    }
    public void turnmotoron() {
    	System.out.println("Turning motor on");
    }
    public void runoutbenzine() {
    	System.out.println("Running out of benzine please Gas station");
    }
}
