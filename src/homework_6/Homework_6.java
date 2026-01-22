package homework_6;

public class Homework_6 {
	public static void main(String[] args) {
		// 1
		student student1 = new student("Jumshud" , 12 , 20.0);
		student1.printInfo();
		student student2 = new student("Raul" , 10 , 1.0);
		student2.printInfo();
        // 2
		int result1 = student1.calculate(5,2);
		System.out.println("Result : " + result1);
		
		student2.average(1,2,3,4);
		student2.printMax(1,2,3,4,5,6,8,9,1,19876,23,98);
	}
	

}
