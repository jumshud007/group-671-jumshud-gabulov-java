package homework_8;

public class Orangutan {
    String name;
    Boolean hastail;
    
    public Orangutan(String name, boolean hastail) {
   	 this.name = name;
   	 this.hastail = hastail;
    }   
    
    public Orangutan( boolean hastail) {
     this.hastail = hastail;
    }
    
    public void walk() {
   	 System.out.println("Walking");
    }
    public void climb() {
    	System.out.println("Climbing");
    }
}
