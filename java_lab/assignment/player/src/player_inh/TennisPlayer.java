package player_inh;

public class TennisPlayer extends Player{
private int matches;
	
	public TennisPlayer(String name,int age,String country,int matches)
	{
		super(name,age,country);
		System.out.println("in Tennis Player ctor");	
		
		this.matches=matches;
		
	}
	
	@Override
	public String toString()
	{
		return "Football Player details " +super.toString() +"with mathches "
	+this.matches+" ";
	}

}
