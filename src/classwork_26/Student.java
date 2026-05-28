package classwork_26;

public class Student {
    String name;
    int gruppa;
    int[] ozenki = new int[7];
    void averageGrade() {
    	int sum = 0;
    	for(int a : ozenki) {
    		sum += a;
    	}
    	sum /= ozenki.length;
    }
    public Student(String name, int gruppa, int[] ozenki) {
		super();
		this.name = name;
		this.gruppa = gruppa;
		this.ozenki = ozenki;
	}
	void info() {System.out.println(name);}
	public Student(String name) {
		super();
		this.name = name;
	}
	
}
