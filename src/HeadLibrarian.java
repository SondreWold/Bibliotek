package bibliotek;

public class HeadLibrarian implements Employee{

	public String name;
	
	public HeadLibrarian(String name) {
		this.name = name;
	}
	
	@Override
	public void cleanDust() {
		System.out.println("I am a head librarian, my name is " + getName()+ " and even i have to dust the shelves now.");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
