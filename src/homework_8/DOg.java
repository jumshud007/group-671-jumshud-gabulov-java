package homework_8;

public class DOg {
    String name;
    Boolean hastail;
    String colour;
    public DOg(String name, boolean hastail,String colour) {
   	 this.name = name;
   	 this.hastail = hastail;
   	 this.colour = colour;
    }
    
    public void bark() {
   	 System.out.println("Barking");
    }
    public void run() {
    	System.out.println("Running");
    }
}
