package bibliotek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library  {
	
	//Oppretter en liste med alle bøkene, uavhengig av type.
	public List<Book> myLibrary = new ArrayList<Book>();
	public Map<Person, List<Book>> onLoan = new HashMap<Person, List<Book>>();
	public List<Employee> employees = new ArrayList<>();

	//-------------------------Sorteringsmetode som bruker Java 8 - Streams --------//
	//Fjerner alle bøker skrevet av forfatter x i biblioteket. 
	public List<Book> removeAuthor(List<Book> library, String author){
		return library.stream()
				.filter(n -> !( n.getAuthor().equals(author)))
				.collect(Collectors.toList());
	}
	
	//Legger til alle bøkene som blir gitt som et input paramteter via bruk av VARARGS
	// addBooks(a,b,c...etc ) --> alle blir lagt til.
	public void addBooks(Book...books){
		this.myLibrary = Arrays.asList(books);	
	}
	public void removeBook(Book book){
		myLibrary.remove(book);
	}
	
	public Book getBookByTitle(String title){
		Book b = null;
		for(Book book : myLibrary){
			if(book.getName().equals(title)){
				b = book;
				
			}
		}
		return b;
	}
	
	
	public void rentBook(Person person, String title){
		
			if(!onLoan.keySet().contains(person)){
				onLoan.put(person, new ArrayList<Book>());
			}
			Book book = getBookByTitle(title);
			
			this.onLoan.get(person).add(book);
			this.removeBook(book);
			
			person.booksIHaveRented.add(book);
	}
	
	public void bookDelivered(Person person, Book book){
		this.onLoan.get(person).remove(book);
		this.addBooks(book);
		
		if(this.onLoan.get(person).isEmpty()){
			onLoan.remove(person);
		}
	}	
	
	public void addEmployees(Employee... e){
		if(this.employees.contains(e)){
			throw new IllegalArgumentException("Employee is allready registered");
		}
		employees = Arrays.asList(e);
	}
	
	
	public void removeEmployee(Employee e){
		if(!this.employees.contains(e)){
			throw new IllegalArgumentException("Employee does not work here");
		}
		employees.remove(e);
	}
	
	public void timeToDust(){
		for(Employee e : employees){
			e.cleanDust();
		}
	}
	
	
}
