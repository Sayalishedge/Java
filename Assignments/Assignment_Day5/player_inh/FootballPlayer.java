package player_inh;

public class FootballPlayer extends Player{
	
	private int goals;
	
	public FootballPlayer(String name,int age,String country,int goals)
	{
		super(name,age,country);
		System.out.println("in Football Player ctor");	
		
		this.goals=goals;
		
	}
	
	@Override
	public String toString()
	{
		return "Football Player details " +super.toString() +"with goals "
	+this.goals+" ";
	}
	
	

}
