package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.showroom.core.Vehicle;

import custom_exceptions.InvalidInputException;
import custom_ordering.VehicleDatePriceDescComparator;
import custom_ordering.VehiclePriceComparator;
import utils.ShowroomUtils;
import utils.ShowroomValidationRules;
import static utils.ShowroomValidationRules.validateAllInputs;
import static utils.ShowroomUtils.*;

public class ShowroomManagement {

	public static void main(String[] args) {
		// create a scanner
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Vehicle> vehicles = populateShowroom();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options : 1. Add a Vehicle " + "2. Display all\n "
							+ "3. Display specific vehicle details 4. Update Price\n "
							+ "5. Delete vehicle details 6. Sort vehicles as per chasis no(Natural Ordering)\n"
							+ "7. Sort vehicles as per price(Custom Ordering) \n"
							+ "8. Sort the vehicles as per date n desc  order of  price\n"
							+ " 0. Exit");
					System.out.println("Choose an option");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter vehicle details :  chasisNo,  vehicleColor	 basePrice"
								+ "  manufactureDate(yr-mon-day),  company,");
						Vehicle vehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(),
								vehicles);
						// success
						vehicles.add(vehicle);
						System.out.println("Vehicle added....");
						break;
					case 2:
						System.out.println("Showroom details");
						for (Vehicle v : vehicles)
							System.out.println(v);
						break;
					case 3:
						System.out.println("Enter chasis no");
						System.out.println(findByChasisNo(sc.next(), vehicles));
						break;

					case 4:
						System.out.println("Enter chasis no n price offset");
						String chasisNo = sc.next();
						double priceOffset = sc.nextDouble();
						vehicle = findByChasisNo(chasisNo, vehicles);
						// => vehicle exists , simply call setter ti modify it's price
						vehicle.setBasePrice(vehicle.getBasePrice() + priceOffset);
						System.out.println("Price updated....");
						break;
					case 5:
						System.out.println("Enter chasis no to remove vehicle details");
						System.out.println(deleteByChasisNo(sc.next(),vehicles));
						break;
						
					case 6 : System.out.println("Vehicle details sorted as per ch no");
					Collections.sort(vehicles);
						break;
						
					case 7 : System.out.println("Vehicles sorted as per price");
					//Collections class : public static void sort(List<T> list,Comparator comp)
					Collections.sort(vehicles,new VehiclePriceComparator());
					/*
					 * JVM invokes Tim's sorting algo 
					 * Internally calls : compare(..) on VehiclePriceComparator
					 * If it rets : -1 or 0 : no swapping of refs
					 * o.w : shuffles the refs
					 */
					break;
					case 8 :
						System.out.println("Vehicles sorted as per date (asc) n price (desc)");
						Collections.sort(vehicles,new VehicleDatePriceDescComparator());
						break;

					case 0:
						
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("Pls retry...");
					//read off pending tokens from the scanner
					sc.nextLine();
				}
			}
		} // JVM : sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
