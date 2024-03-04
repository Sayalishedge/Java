package player_inh;

public class Player {
	
	private String name;
	private int age;
	private String country;
	
	public Player(String name,int age,String country)
	{
		this.age=age;
		this.name=name;
		this.country=country;
		
		System.out.println("in player's constructor");
		
		
		
	}
	
	@Override // method level compile time annotation :
	// to inform javac following is the overriding form of the method
	public String toString() {
		return this.name + " " + this.age+" "+this.country;
	}
	
	
	
	

}
