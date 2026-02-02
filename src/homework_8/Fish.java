package homework_8;

public class Fish {
    String name;
    Boolean hastail;
    String colour;
    public Fish(String name, boolean hastail,String colour) {
   	 this.name = name;
   	 this.hastail = hastail;
   	 this.colour = colour;
    }
    public Fish( boolean hastail,String colour) {
      	 this.hastail = hastail;
      	 this.colour = colour;
    }
    public void swim() {
    	System.out.println("Swimming");
    }

}
