package classwork_24;

public class Student {
   String name;
   int age;
   int score;
   public Student(String name, int age, int score) {
	this.name = name;
	this.age = age;
	this.score = score;
   }
   @Override
public String toString() {
	  return this.name + this.age + this.score;
  }
   
}
