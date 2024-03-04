package inheritance2;

public class Student extends Person {
	
	
	private int gradYear;
	private String course;
	private int fees;
	private int marks;
	
	
	//add sub class constructor
	public Student(String fn, String ln, int year, String course, int fees, int marks) {
		
		//call/invoke explicitly immediately super class parameterized constructor
		super(fn,ln);
		
		System.out.println("In student's constructor");
		
		//initialize remaining states
		this.gradYear = year;
		this.course  = course;
		this.fees = fees;
		this.marks = marks;
		
	
	}
	
	
	//added by javac impl
	//public Student(){
	// super()
	//}
	//overriding getDetails method to return complete student details
	public String getDetails() {
		
		return "Student : " +super.getDetails() +" Graduated in " + this.gradYear + " with marks " + this.marks + " of course " + this.course + " having fees" + this.fees;
		
		
	}
	
	
	

}
