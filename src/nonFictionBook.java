package bibliotek;

public class nonFictionBook extends Book {
	
	private final boolean isSchoolBook;
	public nonFictionBook(String name, String author, int pages, String subject, boolean isSchoolBook) {
		super(name, author, pages, subject);
		this.isSchoolBook = isSchoolBook;
	}
	public boolean getisSchoolBook() {
		return isSchoolBook;
	}

}
