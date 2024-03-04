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
	public void play()
	{
		/*
		 * return ("CricketPlayer details " ); super.play();
		 * System.out.println("with runs"); this.runs;
		 */
	}
	
	
	

}
