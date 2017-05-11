package bibliotek;

import java.util.Collections;

public class SondresBibliotek {
	
	
	//Programklasse, her foreg�r opprettelsen av biblioteket, konsoll-printing osv...
	public static void main(String[] args) {
		//Lager noen Book-objekter.
				Book a = new Novel("Krig og Fred", "Leo Tolstoy", 1022, "Skj�nnlitteratur",false);
				Book b = new Novel("Den fremmede", "Albert Camus", 150, "Skj�nnlitteratur", true);
				Book c = new Novel("Nausea", "Jean-Paul Sartre", 322, "Skj�nnlitteratur",false);
				Book d = new Novel("Br�drene Karamazov", "Fjodor Dostojevski", 750, "Skj�nnlitteratur",false);
				Book e = new Novel("Steppenwolf", "Herman Hesse", 219, "Skj�nnlitteratur",false);
				Book f = new Novel("Min Kamp", "Karl Ove Knausgaard", 922, "Skj�nnlitteratur",false);
				Book g = new nonFictionBook("Sinus R1", "En gjeng med tr�tte typer", 500, "Fagbok", true);
				Book h = new nonFictionBook("Relativitetsteorien", "Albert Einstein", 198, "Fagbok", false);
				
				//Lager noen folk som jobber p� biblioteket
				Employee terje = new Clerk("Terje");
				Employee arne = new Clerk("Arne");
				Employee bjarne = new HeadLibrarian("Bjarne");
				
				//Lager et nytt Library-Objekt
				Library bibba = new Library();
				//Legger til alle b�kene
				bibba.addBooks(a,b,c,d,e,f,g,h);
				//Legger til alle ansatte
				bibba.addEmployees(terje,arne,bjarne);
				
				//----------------SORTERING-----------------------//
				//Fjerner Fjodor Dosssssstojevski fra lista, fordi jeg kan.
				bibba.myLibrary = bibba.removeAuthor(bibba.myLibrary, "Fjodor Dostojevski");
				//Sorterer listen etter antall sidetall, synkende , med BookComparator-klassen.
				Collections.sort(bibba.myLibrary, new BookComparator(true));
				
				//------L�NING------//
				Person lars = new Person("Lars", bibba);
				Person brysthilde = new Person("Brysthilde", bibba);
				lars.rentBook("Nausea");
				lars.rentBook("Min Kamp");
				brysthilde.rentBook("Steppenwolf");
				
				
				
				//------------------PRINTING TIL SKJERMEN-----------//
				System.out.println("Library Overview" + "\n");
				//Oppretter et nytt Iterator objekt av typen BookIterator, med bibba som paramter.
				//Kaller toString()-metoden p� hver eneste bok. Denne haret standarisert format
				//angitt i den abstrakte superklassen Book.java
				BookIterator bookIterator = new BookIterator(bibba.myLibrary);
				while(bookIterator.hasNext()){
					System.out.println(bookIterator.next().toString());
				}
				
				System.out.println();
				System.out.println("This library's borrowers, and the books they currently have on loan:" + "\n");
				for(Person p : bibba.onLoan.keySet()){
					System.out.println(p.toString());
				}
				
				System.out.println("\n TIME TO DUST THE SHELVES!"+"\n");
				bibba.timeToDust();
	}
}
