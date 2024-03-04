import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter Your Name : Email : Age :Credit Limit ::");
		
		String n1 = sc.next();
		String e = sc.next();
		int age = sc.nextInt();
		double c = sc.nextDouble();
		
		Customer c1 = new Customer(n1,e,age,c);
		
		System.out.println(c1.customerDetails());
		
		
		
	}

}
