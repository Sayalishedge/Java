package inheritance2;

public class Person {
	private String firstName;
	private String lastName;

	// add a parameterized constructor to init state of the person
	public Person(String firstName, String lastName) {
		System.out.println("In person's constructor");
		this.firstName = firstName;
		this.lastName = lastName;
		
		}
	//method to return person details
	public String getDetails() {
		
		return this.firstName+ " " + this.lastName;
		
	}

	/*
	 * public Person() {
	 * 
	 * }
	 * 
	 */
}
