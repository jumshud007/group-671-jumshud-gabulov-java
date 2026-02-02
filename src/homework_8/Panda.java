package homework_8;

public class Panda {
    String name;
    int age;
    
    public Panda(String name, int age) {
   	 this.name = name;
   	 this.age = age;
    }   
    public Panda(int age) {
     this.age = age;
    }
    
    public void climb() {
    	System.out.println("Climbing");
    }
    public void sleeping() {
    	System.out.println("Sleeping");
    }
}
