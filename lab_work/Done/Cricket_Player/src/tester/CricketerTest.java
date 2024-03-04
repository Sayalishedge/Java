package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cricketer.core.Cricketer;

import custom_exception.InvalidInputException;

import static utils.CricketerUtils.checkForDups;
public class CricketerTest {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in))
		{
			
			Map<String, Cricketer> cricketers = new HashMap<>();
			boolean exit= false;
			while(!exit)
			{
				try {
					
					System.out.println("Enter Options:");
					System.out.println("1. Add Cricketer.");
					System.out.println("2. Modify Cricketer's rating.");
					System.out.println("3. Search Cricketer by Name.");
					System.out.println("4. Display all the Cricketer.");
					System.out.println("5. Sort Cricketer by Rating.");
					
					switch(sc.nextInt())
					{
					
					case 1:
						
						System.out.println("Enter Cricketer Name");
						String name = sc.next();
						checkForDups(name, cricketers);
						System.out.println("Enter " +name+ "'s, Age, EmailId, PhoneNo, Rating");
						Cricketer c = new Cricketer(name, sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
						cricketers.put(name, c);
					
						break;
						
					case 2:
						System.out.println("Enter cricketer's Name and new Rating");
						c = cricketers.get(sc.next());
						if(c==null)
							throw new InvalidInputException("Cricketer doesn't exists");
						c.setRating(sc.nextInt());
						System.out.println("Rating updated");
						
						break;
					
					case 3:
						System.out.println("Enter Cricketer's Name:");
						c = cricketers.get(sc.next());
						if (c==null)
							throw new InvalidInputException("Cricketer with this name not found!!");
						System.out.println(c);
						break;
					
					case 4:
						System.out.println("All cricketer");
						for (Cricketer c1: cricketers.values())
							System.out.println(c1);
						break;
						
					case 5:
						List<Cricketer> cricketerlist = new ArrayList<Cricketer> (cricketers.values());
						Collections.sort(cricketerlist, (c1,c2) -> Integer.compare(c1.getRating(), c2.getRating()));
						System.out.println("Cricketers sorted by Rating");
						cricketerlist.forEach(p -> System.out.println(p));
						break;
						
					case 6:
						exit = true;
						
						break;
					}//end of switch
					
					
					
				}//end of try inner
				catch(Exception e)
				{
					
				}//end of catch inner
				
				
			}//end of while
			
			
			
		}//end of try (outer)
		catch(Exception e)
		{
			e.printStackTrace();
		}//end of catch

	}

}
