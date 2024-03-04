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
	public String toString()
	{
		return "CricketPlayer details " +super.toString() +"with runs "
	+this.runs+" ";
	}

	

}
