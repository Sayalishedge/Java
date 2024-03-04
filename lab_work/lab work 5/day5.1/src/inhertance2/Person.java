package inhertance2;

public class Person {
	private String firstName;
	private String lastName;

	// add a parametrized ctor to init state of the person
	public Person(String firstName, String lastName) {
		System.out.println("in person's ctor");
		this.firstName = firstName;
		this.lastName = lastName;
	}
//	public Person()
//	{
//		
//	}
	//add a method to return Person's details
	public String getDetails() {
		return this.firstName+" "+this.lastName;
	}
}
