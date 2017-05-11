package bibliotek;

public class Novel extends Book{

	private final boolean hasWonNobelPrice;
	
	//Sender de feltene som er felles for alle bøker til superklassen Book, og sender denne klassens
	//unike felt, hasWonNobelPrice, til dens eget felt.
	public Novel(String name, String author, int pages, String subject, boolean hasWonNobelPrice) {
		super(name, author, pages, subject);
		this.hasWonNobelPrice = hasWonNobelPrice;
		
	}
	
	public boolean getHasWonNobelPrice(){
		return this.hasWonNobelPrice;
	}
}
