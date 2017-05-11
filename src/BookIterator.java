package bibliotek;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator<Book> {
	
	List<Book> bibliotek;

	
	private int index = 0;
	
	//Konstruktør som tar inn et bibliotek
	public BookIterator(List<Book> bibliotek){
		this.bibliotek = bibliotek;
	}

	//Befinner vi oss fortsatt på en index som er lavere enn den totale lengden på biblioteket?
	@Override
	public boolean hasNext() {
		return index < bibliotek.size();
	}
	//Gir ut neste bok;
	@Override
	public Book next() {
		Book nextBook = bibliotek.get(index);
		index++;
		return nextBook;
	}
	
}
