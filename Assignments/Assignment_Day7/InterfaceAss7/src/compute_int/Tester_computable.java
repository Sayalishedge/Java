package compute_int;
import java.util.*;


public  class Tester_computable  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		Computable ref= null;
		boolean flag = false;
		
		
		
		
	while(flag!=true)	{
		
		
		System.out.println("Options : \n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide\n 5.Exit");
		int choice = sc.nextInt();
	
		switch(choice) {
		case 1 :
			ref =  new Adder();
			System.out.println("Enter two numbers for addition: \n");
			System.out.println("Addition : " + ref.compute(sc.nextDouble(), sc.nextDouble()));
			break;
			
			
		case 2:

			ref =  new Subtracter();
			System.out.println("Enter two numbers for subtraction: \n");
			System.out.println("Subtraction : " +ref.compute(sc.nextDouble(), sc.nextDouble()));
			break;
			
		case 3:

			 ref =  new Multiplier();
			System.out.println("Enter two numbers for multiplication: \n");
			System.out.println("Multiplication : " +ref.compute(sc.nextDouble(), sc.nextDouble()));
			break;
				
		case 4:

			 ref =  new Divider();
			System.out.println("Enter two numbers for division: \n");
			System.out.println("Division : " +ref.compute(sc.nextDouble(), sc.nextDouble()));
			break;
				
		
		  case 5:
			  flag = true;
			  break;
		 
			
		}	
			
			
	}
		
		
		
		
		sc.close();

	}

}
