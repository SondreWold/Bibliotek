package bibliotek;

public class Clerk implements Employee{
	private String name;
	
	public Clerk(String name){
		this.name = name;
	}
	
	@Override
	public void cleanDust() {
		System.out.println("I am a Clerk, and my name is  " + getName() + " and im currently dusting the shelves");
	}

	@Override
	public String getName() {
		return name;
	}

}
