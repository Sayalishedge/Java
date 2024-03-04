package tester;

import java.util.Scanner;

import com.showroom.core.Vehicle;

import utils.ShowroomValidationRules;
import static utils.ShowroomValidationRules.validateAllInputs;

public class ShowroomManagement {

	public static void main(String[] args) {
		// create a scanner
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter showroom capacity");
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				try {
					System.out.println("Options : 1. Add a Vehicle " + "2. Display all 0. Exit");
					System.out.println("Choose an option");
					switch (sc.nextInt()) {
					case 1:
						if (counter < vehicles.length) {
							System.out.println("Enter vehicle details :  chasisNo,  vehicleColor	 basePrice"
									+ "  manufactureDate(yr-mon-day),  company,");
							Vehicle vehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(),
									sc.next(), vehicles);
							// success
							vehicles[counter++] = vehicle;
							System.out.println("Vehilce added....");
						} else
							System.out.println("Showroom full !!!!!!");
						break;
					case 2:
						System.out.println("Showroom details");
						for (Vehicle v : vehicles)
							if (v != null)
								System.out.println(v);
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("Pls retry...");
				}
			}
		} // JVM : sc.close()

	}

}
