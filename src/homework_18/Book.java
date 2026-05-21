package homework_18;

public class Book {
	String title;
	String author;
	int year;
	private boolean isAvailiable = true;

	void borrow() {
		if (isAvailiable) {
			System.out.println("Bыдать книгу");
		} else {
			System.out.println("Книга уже занята");
		}
	}
	
	void returnBook() {System.out.println(" вернуть книгу");}
	
	void getInfo() {System.out.println("Title :" + title + "; Author :" + author + "; Year" + year);}

}
