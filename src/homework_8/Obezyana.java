package homework_8;

public class Obezyana {
    String name;
    Boolean hastail;
    
    public Obezyana(String name, boolean hastail) {
   	 this.name = name;
   	 this.hastail = hastail;
    }   
    
    public Obezyana( boolean hastail) {
     this.hastail = hastail;
    }
    
    public void walk() {
   	 System.out.println("Walking");
    }
    public void climb() {
    	System.out.println("Climbing");
    }
}
