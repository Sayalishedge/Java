package player_inh;

public class CricketPlayer extends Player {
	
	private int runs;
	
	public CricketPlayer(String name,int age,String country,int runs)
	{
		super(name,age,country);
		System.out.println("in CricketPlayer ctor");	
		
		this.runs=runs;
		
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
