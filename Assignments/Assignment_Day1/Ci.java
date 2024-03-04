import java.util.*;
class Ci{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the rate:");
	int rate = sc.nextInt();

	System.out.println("Enter the principle:");
	int pr = sc.nextInt();

	System.out.println("Enter the year:");
	int year = sc.nextInt();

	int ci;
	ci = (pr*((1+(rate/100))^year)-pr );
    
    
	System.out.println("Compound Interest:"+ ci);







	sc.close();

}





}

