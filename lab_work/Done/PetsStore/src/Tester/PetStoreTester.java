package Tester;

import static utils.AdminUtils.popOrders;
import static utils.AdminUtils.checkAdmins;
import static utils.CustomerUtils.checkCus;
import static utils.PetUtils.populate_pet;
 

import static com.pets.core.Pets.dogc;
import static com.pets.core.Pets.catc;
import static com.pets.core.Pets.rabbitc;
import static com.pets.core.Pets.fishc;

import java.util.HashMap;
import java.util.Scanner;

import com.pets.core.Category;
import com.pets.core.Order;
import com.pets.core.Pets;

import custom_exception.InvalidInputException;


public class PetStoreTester {

	public static void main(String[] args) {
	
		HashMap<Integer, Pets> pets = populate_pet();
		HashMap<Integer, Order> orders = popOrders();
		
		try(Scanner sc = new Scanner(System.in))
		{
			boolean exit1=false;
			while(!exit1)
			{
				System.out.println("Who are you?");
				System.out.println("a.Customer\nb.Admin");
				
				switch(sc.next())
				{
				
				case "a": // for Customer
					System.out.println("Enter your username and Password");
					boolean b = checkCus(sc.next(), sc.next());
					if(b==true)
					{
						System.out.println("1. Display All Pets.");
						System.out.println("2. Order Pet.");
						System.out.println("3. Check Order Status.");
						System.out.println("0. Exit");
						
						switch(sc.nextInt())
						{
						case 1:
							
							pets.values().stream().forEach(p -> System.out.println(p));
							break;
							
							
						case 2:
							System.out.println("Which pet do you want?");
							System.out.println("1.dog\n2.cat\n3.fish\n4.rabbit");
							int choice = sc.nextInt();
							
							System.out.println("How many pets do you want?");
							int count = sc.nextInt();
							
							if(choice==1)
								if(count<=dogc)
									dogc=dogc-count;
								else
									throw new InvalidInputException("Dogs out of stock");
							
							else if(choice==2)
								if(count<=catc)
									catc=catc-count;
								else
									throw new InvalidInputException("Cat out of stock");
							
							else if(choice==3)
								if(count<=fishc)
									fishc=fishc-count;
								else
									throw new InvalidInputException("Fish out of stock");
							
							else if(choice==4)
								if(count<=rabbitc)
									rabbitc=rabbitc-count;
								else
									throw new InvalidInputException("Rabbit out of stock"); 						
							break;
							
						case 3:
							
							System.out.println("Enter Order Id to check Order Status");
							int id= sc.nextInt();
							if(orders.containsKey(id))
								System.out.println("Order Status:"+ id);
							else 
								throw new InvalidInputException("Pet does not exists");
							break;
						
						case 0:
							exit1=true;
							break;
						
						}//end of cust switch
						
						
					}//end of if
					break;
				
					
					
				case "b": // for Admin
					System.out.println("Enter your username and Password");
					boolean a = checkAdmins(sc.next(), sc.next());
					if(a==true)
					{
						System.out.println("1. Add new Pets.");
						System.out.println("2. Update Pet details (change price).");
						System.out.println("3. Update Order Status.");
						System.out.println("4. Display All Pets.");
						System.out.println("0. Exit");
						
						switch(sc.nextInt())
						{
						case 1:
							System.out.println("enter petid, name , category, price");
							Pets p = new Pets(sc.nextInt(), sc.next(), Category.valueOf(sc.next().toUpperCase()),sc.nextDouble());
							System.out.println("New Pet Added");
							break;
							
							
						case 2:
							System.out.println("Enter pet id ");
							int pid = sc.nextInt();
							if(pets.containsKey(pid))
							{
								System.out.println("Enter new price of pet");
								double price = sc.nextDouble();
								Pets p1 = pets.get(pid);
								p1.setUprice(price);
								System.out.println("Pet details updated successfully!!");
							}
							break;
							
						case 3:
							break;
							
						case 4:
							System.out.println("All pet details:");
							pets.values().stream().forEach(q -> System.out.println(q));
							break;
						}//end of switch						
					}//end of if
			
					break;
				
				}//end of main switch
				
			}//end of while
			
			
			
		}//end of outer try
		catch(Exception e)
		{
			e.printStackTrace();
		}
 
	}

}
