package classwork_13;

public class Student {
	String name;
	int age;
	double averageGrade;

	public Student(String name, int age, double averageGrade) {
		this.name = name;
		this.age = age;
		this.averageGrade = averageGrade;
	}
	boolean i = false;
	public void excellent(boolean a) {if(averageGrade >= 90) {a = true; i = a;}}
	public void print() {if(averageGrade >= 90){System.out.println("Name : " + name + "Age" + age + "AverageGrade" + averageGrade +"; Otlichnik");
	if(averageGrade < 90){System.out.println("Name : " + name + "Age" + age + "AverageGrade" + averageGrade +"; Обычный студент");}}
	}
	// ucitelllllll xvatit za mnoy sledit
}
