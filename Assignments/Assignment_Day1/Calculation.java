import java.util.*;

public class Calculation {

	public static void main(String[] args) 
{
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int q;
		do
		{
			System.out.println("enter first element  ");
			double num1 = sc.nextDouble();
				
			System.out.println("enter second element  ");
			double num2 = sc.nextDouble();
			
			System.out.println("enter your choice :");
			System.out.println("1. add 2. sub 3. mul 4. div");
			
			int n = sc.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("addition is :"+(num1+num2));
				break;
			case 2:
				System.out.println("subtraction is :"+(num1-num2));
				break;
			case 3:
				System.out.println("multiplication is :"+(num1*num2));
				break;
			case 4:
				System.out.println("division is :"+(num1/num2));
				break;
			default:
				System.out.println("enter correct choice");
			
				
			 }
			System.out.println("Would you like to quit? (0,1) ");
			      q = sc.nextInt();
		 	
		}
		
		while(q != 1);
		
		sc.close();
		
		
		
		
	}

}
