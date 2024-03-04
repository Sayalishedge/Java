package inheritance2;

public class Faculty extends Person{
	
	private int yoe;
	private String sme;
	
	public Faculty(String fn, String ln,int yoe, String sme) {
		
		super(fn,ln);
		System.out.println("In Faculty's constructor");
		//initialize remaining states
				this.yoe = yoe;
				this.sme  = sme;
				
				
		
	}//overriding getDetails method to return complete student details
	public String getDetails() {
		
		return "Faculty : " +super.getDetails() +" with " +  this.yoe+ " years of experience"  +" having sme "+ this.sme ;
		
		
	}
	
	

}
