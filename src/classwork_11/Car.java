package classwork_11;

public class Car {
      String brand;
      int speed;
      int fuel;
      public void drive(int amount) {fuel -= amount;}
      public void refuel(int amount) {fuel += amount;}
      public void showInfo() {System.out.println("Brand :" + brand + "; Speed :" + speed + "; Fuel :" + fuel);}
}
