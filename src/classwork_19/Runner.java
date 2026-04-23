package classwork_19;

public class Runner {
	public static void main(String[] args) {
		// 1
		byte a = 25;
		short b = a;
		int c = b;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// 2
		double d = 34.45;
		float f = (float) d;

		System.out.println(f);
		// 3
		long l = 260L;
		byte m = (byte) l;

		System.out.println(b);
		// 4
		int age = 20;// 20
		float price = 15.5F;// 15.5F
		char grade = 'A';// 'A'
		String name = "Java";// "Java"
		boolean isOpen = true;// true
		// 5
// 5	public void run() { }

// 1	package lesson;

// 2    import java.util.ArrayList;

// 3    String name;

// 4    public Runner() { }
	
		
		// 9 
		Student student1 = new Student("Jum", 12);
		student1.introduce();
		
		// 10
		// 3 public void study() { }

		// 1 String name;

		// 2 public Student(String name) {
		//    this.name = name;
		//}

	}
}
