package tester;

import static utils.TeamUtils.checkForDuplicateId;
import static utils.TeamUtils.parseAndValidateShipmentDate;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import core.ProductItem;

public class testProductTeam {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			
			
			HashMap<String,ProductItem> hmap = new HashMap<>();
			
			boolean flag = false;
			while(!flag) {
				System.out.println("Options\n"
						+ "1.Add new product item\n"
						+ "2. Update the quantity of item in stock\n"
						+ "3. Display all product items\n"
						+ "4. Remove all products whose available stock is zero\n "
						+ "5 .Display the product items  for which the shipment date is due in the next week\n"
						+ "0.Exit");
				
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter itemcode");
					String pid = sc.next();
					checkForDuplicateId(pid,hmap);
					//String itemCode, String description, double price, LocalDate shipmentDate, int availableStock
					System.out.println("Enter description, price,shipmentdate, availableStock");
					ProductItem p1 = new ProductItem(pid, sc.next(), sc.nextDouble(), parseAndValidateShipmentDate(sc.next()),sc.nextInt());
					hmap.put(pid, p1);
					System.out.println("Product item added successfully");
					break;
					
				case 2:
					System.out.println("Enter itemcode");
					pid = sc.next();
					checkForDuplicateId(pid,hmap);
					ProductItem p2 = hmap.get(pid);
					System.out.println("Enter the quantity of item");
					p2.setAvailableStock(sc.nextInt());
					
					break;
					
				case 3:
					System.out.println("Product items");
					hmap.values().stream().
					forEach(p->System.out.println(p));
				
					break;
					
				case 4:
					System.out.println("Removing all products whose available stock is zero");
					hmap.values().removeIf(p -> p.getAvailableStock()==0);
					
					break;
					
				case 5:
					System.out.println("Displaying Shippments within a week");
					LocalDate date = LocalDate.now();
					LocalDate newDate = date.plusDays(7);
				
					//LocalDate oneWeekLateDate = todaysDate.plus(1,ChronoUnit.WEEKS);
					hmap.values().stream() .filter(d -> d.getShipmentDate().isBefore(newDate))
					.forEach(p -> System.out.println(p));
					
					
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
