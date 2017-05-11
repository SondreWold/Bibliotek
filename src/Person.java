package bibliotek;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private final String name;
	private Library mittBibliotek;
	public List<Book> booksIHaveRented = new ArrayList<>();
	
	public Person(String name, Library biblio) {
		this.name = name;
		this.mittBibliotek = biblio;
	}
	
	public void rentBook(String title){
		mittBibliotek.rentBook(this, title);
	}
	
	public void deliverBackBook(Book book){
		if(!this.booksIHaveRented.contains(book)){
			System.out.println("Cant deliver back a book you never rented");
		}
		mittBibliotek.bookDelivered(this, book);
		booksIHaveRented.remove(book);
	}
	
	
	public String getName() {
		return name;
	}

	public String printRentedBooks(){
		String res ="";
		for (Book b : booksIHaveRented){
			res += b.toString();
		}
		return res;
	}
	@Override
	public String toString() {
		return getName() + ":" + "\n" + 
				"I have the following book(s) on loan: " + "\n" + this.printRentedBooks() + "\n";
	}
	
	
}
