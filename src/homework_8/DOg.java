package homework_8;

public class DOg {
    String name;
    int age;
    String breed;
    public DOg(String name, boolean b,String breed) {
   	 this.name = name;
   	 this.age = b;
   	 this.breed = breed;
    }
    
    public DOg(String name2, boolean hastail, String colour) {
		// TODO Auto-generated constructor stub
	}

	public void bark() {
   	 System.out.println("Barking");
    }
    public void run() {
    	System.out.println("Running");
    }
}
