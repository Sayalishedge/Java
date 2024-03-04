package inhertance2;

public class Faculty extends Person {
	private int yrsOfExperience;
	private String sme;
	public Faculty(String firstName, String lastName, int yrsOfExperience, String sme) {
		super(firstName, lastName);
		System.out.println("in faculty'c ctor");
		this.yrsOfExperience = yrsOfExperience;
		this.sme = sme;
	}
	
}
