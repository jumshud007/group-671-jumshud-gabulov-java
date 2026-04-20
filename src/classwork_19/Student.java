package classwork_19;

public class Student {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {System.out.println("Меня зовут" + name + " и мне" + age + "лет");}
}