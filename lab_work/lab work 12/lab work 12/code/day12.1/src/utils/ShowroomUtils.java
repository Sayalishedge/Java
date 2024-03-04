package utils;

import java.util.ArrayList;

import com.showroom.core.Vehicle;

import custom_exceptions.InvalidInputException;
import static utils.ShowroomValidationRules.validateAllInputs;

public class ShowroomUtils {
//add public static method to get vehicle details by it's PK (ch no)
	public static Vehicle findByChasisNo(String chasisNo, ArrayList<Vehicle> list) throws InvalidInputException {
		Vehicle v = new Vehicle(chasisNo);
		int index = list.indexOf(v);
		if (index == -1)
			throw new InvalidInputException("Vehicle not found!!!!");
		return list.get(index);
	}

	// add public static method to remove vehicle details by it's PK (ch no)
	public static Vehicle deleteByChasisNo(String chasisNo, ArrayList<Vehicle> list) throws InvalidInputException {
		Vehicle v = new Vehicle(chasisNo);
		int index = list.indexOf(v);
		if (index == -1)
			throw new InvalidInputException("Vehicle not found!!!!");
		// vehicle found
		return list.remove(index);
	}

	// add public static method to return populated list of vehicles to the caller
	// use sample data
	public static ArrayList<Vehicle> populateShowroom() throws InvalidInputException {
		// create empty AL
		ArrayList<Vehicle> list = new ArrayList<>();
		list.add(validateAllInputs("abc-1001", 
				"black", 300000, "2021-10-11", "Maruti", list));
		list.add(validateAllInputs("abc-1009", 
				"white", 340000, "2022-11-11", "Mahindra", list));
		list.add(validateAllInputs("abc-1003", 
				"white", 370000, "2021-10-11", "Maruti", list));
		list.add(validateAllInputs("abc-1004", 
				"black", 390000, "2023-01-15", "Maruti", list));
		list.add(validateAllInputs("abc-1007", 
				"white", 670000, "2021-10-11", "Maruti", list));
		return list;//utils class rets populated showroom to tester
	}

}
