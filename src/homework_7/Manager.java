package homework_7;

public class Manager extends Employee {

   @Override
   public void calculateBonus() {
	   System.out.println("Your bonus : " + salary * 1.5);
   }
   
}
