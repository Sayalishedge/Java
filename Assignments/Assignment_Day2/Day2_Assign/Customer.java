
public class Customer {
	
	
	/*3.1 Create a Customer class , with data members (all private : tight encapsulation)
	name(String),email(String),age(int), creditLimit(double)

	Do not supply any constructor first(this is to confirm a default constructor)
	Add a method to return all customer details , in a string .
	*/
	
	private String name ;
	private int age ;
	private String email ;
	private double creditlimit ;
	
	/*public Customer() {
	name = "abc";
	age = 22 ;
	email = "abs@gmail.com" ;
	creditlimit = 2000 ;
}

*/
	
	
	Customer(String n , String e ,int a, double c )
	{
		this.name = n;
		this.email = e ;
		this.age = a ;
		this.creditlimit = c ;
	}


String customerDetails()
{
	return this.name + " " + this.age + " " + this.email + " " + 
			this.creditlimit;
	
}





}