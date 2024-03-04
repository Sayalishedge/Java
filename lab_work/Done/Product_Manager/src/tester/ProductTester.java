package tester;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

import com.productmanager.core.ProductItem;

import static utils.ProductsUtils.*;
import static utils.ProductsUtils.populatedProducts;
import static utils.ProductsUtils.CheckForDup;

public class ProductTester {

	public static void main(String[] args) {

		
		try(Scanner sc = new Scanner(System.in))
		{
			ArrayList<ProductItem> list = populatedProducts();
			boolean exit = false;
			while(!exit)
			{
				try 
				{
					System.out.println("Enter your Option:");
					System.out.println("1. Add new item.");
					System.out.println("2. Update quantity of item in stock.");
					System.out.println("3. Display all the product items.");
					System.out.println("4. Remove all products whose available stock is zero.");
					System.out.println("5. Display the product items  for which the shipment date is due in the next week.");
					
					
					switch(sc.nextInt())
					{
					
					case 1:
						System.out.println("Adding new Product Item!!!");
						//System.out.println("Enter Product ItemCode:");
						//CheckForDup(list, sc.next());
						
						System.out.println("Enter Product details:\nProduct ItemCode, Description, Price, ShipmentDate, Available Stock");
						CheckForDup(list, sc.next());
						//     (String itemCode, String description, double price, LocalDate shipmentDate, int availableStock) 
						list.add(new ProductItem(sc.next(),sc.next(),sc.nextDouble(),LocalDate.parse(sc.next()),sc.nextInt()));
						break;
						
					case 2:
						System.out.println("Updating quantity of items in stock!! ");
						System.out.println("Enter ItemCode and Quantity");
						String itemcode = sc.next();
						list.stream().filter(p -> p.getItemCode().equals(itemcode)).forEach(p -> p.setAvailableStock(sc.nextInt()));
						System.out.println("Product quantity updated!!!");
						break;
					
					case 3:
						System.out.println("Display all Product details.");
						for(ProductItem p:list)
							System.out.println(p);
						
						break;
						
						
					case 4:
						System.out.println("Removing all products whose available stock is zero");
						list.removeIf(p -> p.getAvailableStock() == 0);
						System.out.println("Successfully Removed");
						break;
						
					case 5:
						System.out.println("Displaying the product items  for which the shipment date is due in the next week");
						LocalDate oneweekfromnow = LocalDate.now().plus(1, ChronoUnit.WEEKS);
						list.stream().filter(p -> p.getShipmentDate().isBefore(oneweekfromnow)).forEach(p -> System.out.println(p));
						break;
					
					case 0:
						System.out.println("Byee");
						exit=true;
						break;
						
					
						
						
					}//end of switch
					
				}//end of inner try
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
				
			}//end of while
			
			
			
			
			
			
			
			
			
			
			
		}//end of outer try
		catch(Exception e)
		{
			e.printStackTrace();
		}//end of catch(outer)

	}

}
