package bibliotek;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{
	
	private boolean descending;
	
	//Sortere stigende eller synkende
	public BookComparator(boolean descending) {
		this.descending = descending;
	}
	
	//Tar inn to Book-objekter. hvis descending er true, så blir Book a = bok2
	// er descending false, blir Book a = bok 1
	// compare gir ut positivt tall hvis vs > hs. derfor må man
	//bytte fortegn med denne teknikken for å få synkende rekkefølge.
	@Override
	public int compare(Book bok1, Book bok2) {
		Book a = (descending ? bok2 : bok1);
		Book b = (descending ? bok1 : bok2);
		return a.getPages() - b.getPages();
	}
	
	
	
	
}
