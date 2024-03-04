package Test;
import java.util.*;

import player_inh.*;


public class TestPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Player p1 = new Player("Tanvee", 33, "india");
//		
//		CricketPlayer cp1 = new CricketPlayer("Tanvee", 44, "india", 56);
//		FootballPlayer fb1 = new FootballPlayer("Tanvee", 44, "india", 6);
//		
		
		
		//System.out.println(p1.getDetails());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many players want to enter");
		Player[] allplayers = new Player[sc.nextInt()];
		
		int counter=0;
		boolean exit=false;
		
		while(!exit) {
			
			System.out.println("1.Add Cricket Player "+"2.Add Football Player"+"3. Add Tennis player"
			+"4.Display the info of all player"+"5.exit ");
			
			System.out.println("Choose an option ");
			
			switch(sc.nextInt())
			{
			case 1:
				if(counter<allplayers.length) {
					System.out.println("Enter player's name");
					String name = sc.next();
					
					System.out.println("Enter player's age");
					int age = sc.nextInt();
					System.out.println("Enter player country");
					String country= sc.next();
					System.out.println("Enter player runs");
					int runs = sc.nextInt();
					
					
					System.out.println("");
					
				}else {
					System.out.println("Not a cricket player.");
				}
				break;
				
				
				
				
				
				
			
			
			
			
			
			
			}
		}
		sc.close();
	}

}
