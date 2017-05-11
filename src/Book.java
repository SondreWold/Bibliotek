package bibliotek;



public abstract class Book {
	
	protected final String name;
	protected final int pages;
	protected final String author;
	protected final String subject;
	
	public Book(String name, String author, int pages, String subject ){
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public int getPages(){
		return pages; 
	}

	public String getAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		return "Author : " + getAuthor() +
				" \n Title: "  + getName() + 
				"\n pages:  " + getPages() +  
				"\n";
	}

	
}
