package tester;

import java.util.ArrayList;
import java.util.Scanner;

import com.showroom.core.Vehicle;

import custom_exceptions.InvalidInputException;
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
					System.out.println("Options : 1. Add a Vehicle " + "2. Display all "
							+ "3. Display specific vehicle details 4. Update Price "
							+ "5. Delete vehicle details 0. Exit");
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
