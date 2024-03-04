package tester;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import static utils.CricketUtils.findByName;
import core.Cricketer;
import customException.CustomException;

public class CricketTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			ArrayList<Cricketer> list = new ArrayList<>();
			
			
			
			boolean flag = false;
			while(!flag) {
				
				System.out.println("Options:\n1. Accept Cricketers in the collection\n2. Modify Cricketer rating\n"
						+ "3. Search Cricketer by name\n4. Display all details\n5. Sorted collection\n0. Exit");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("provide minimum 5 cricketers in: name, age, email, phone, rating");
					System.out.println("enter the number of cricketers to be added");
					int c = sc.nextInt();
					if(c < 5) {
						throw new CustomException("Enter minimum 5 players...");
					}
					for(int i = 0; i<c;i++) {
						list.add(new Cricketer(sc.next(),sc.nextInt(),sc.next(), sc.next(), sc.nextInt()));
						
					}
					break;
					
					
				case 2:
					/*
					 * System.out.println("Enter name of cricketer"); Cricketer c1 =
					 * findByName(sc.next(),list); System.out.println("Enter rating"); int r =
					 * sc.nextInt(); c1.setRating(r);
					 */
							
							
					
					//c1.getRating(c1.setRating(sc.nextInt()));
					
				
					break;
					
				case 3:
					System.out.println("Enter name of cricketer");
					int k = list.indexOf(new Cricketer(sc.next()));
					System.out.println(list.get(k));
					
					break;
					
				case 4:
					
					for (Cricketer c2 : list) {
						System.out.println(c2);
					}
					
					break;
					
				case 5:
					list.stream().sorted(Comparator.comparingInt(Cricketer::getRating))
						.forEach(y -> System.out.println(y));
					
					break;
					
					
					
					
					
					
					
				case 0:
					flag = true;
					break;
				}
				
				
				
				
			}
			
			
			
			
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
