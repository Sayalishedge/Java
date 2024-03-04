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
	// override the inherited toString method : to return Person's details
	/*
	 * Object class Method public String toString()
	 */
@Override // method level compile time annotation :
	// to inform javac following is the overriding form of the method
	public String toString() {
		return this.firstName + " " + this.lastName;
		
	}

	public String getFirstName() {
	   return firstName;
    }



		public String getLastName() {
			return lastName;
		}




}
