package com.acts.geometry;
//import com.acts.Point2D;
import java.util.Scanner;
public class Test{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter X-Y cordinates : ");
	
	Point2D p1= new Point2D(sc.nextInt(), sc.nextInt());
	Point2D p2 = new Point2D(sc.nextInt(), sc.nextInt());
	
	System.out.println("Accepted Cordinates are"+p1.showDetails());
	System.out.println("Accepted Cordinates are"+p2.showDetails());
	
	if (p1.equals(p2))
		System.out.println("Same");
	else
		System.out.println("Different");
	
	
	
	sc.close();
	
	
	
	
}
}