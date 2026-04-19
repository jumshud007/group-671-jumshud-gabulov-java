package homework_13;

public class Student {
	    private String name;
	    private int grade;
	    private static int totalStudents = 0;
	    
	    public Student(String name, int grade) {
	    	this.name = name;
	    	this.grade = grade;
	        totalStudents++;
	    }
	    
	    public String getStatus() {
	    	if (grade > 289) {
				return "Отлично" ;
			}
			if (grade > 269 && grade < 290) {
				return "Хорошо";
			}
			if (grade > 259 && grade < 270) {
				return"Удовл.";
			}
			return "Неуд.";
	    }
	    
	    public static int getTotalStudents() { return totalStudents; }
	    
	    @Override
	    public void toString() {
        return "name :" +  name + "grade" + grade + "totalstudents :" + totalstudents);
	    }
	}

