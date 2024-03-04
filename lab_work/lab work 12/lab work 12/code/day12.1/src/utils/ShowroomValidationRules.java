package utils;

import static java.time.LocalDate.of;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;

import com.showroom.core.Color;
import com.showroom.core.Vehicle;

import custom_exceptions.InvalidInputException;

public class ShowroomValidationRules {
//add a public static method to validate --
	// manufactureDate : must be after 1st Jan 2020
	public static LocalDate parseAndValidateManufactureDate(String date) throws InvalidInputException {
		LocalDate d1 = parse(date);
		// => parsing successful , now do the validation
		if (d1.isAfter(of(2020, 1, 1)))
			return d1;// validation methos rets parsed n validated LocalDate to the tester
		// => old vehicle , throw custom exc
		throw new InvalidInputException("Manufacture date must be after 1st Jan 2020");
	}

	// add a static method for parsing n validation color
	public static Color parseAndValidate(String clr) throws IllegalArgumentException {
		return Color.valueOf(clr.toUpperCase());
	}

	// add a static method for checking the dups
	public static void checkForDup(String newChNo, ArrayList<Vehicle> vehicles) throws InvalidInputException {
		// create a new vehicle instance : wrapping PK (prim key) : unique ID
		Vehicle newVehicle = new Vehicle(newChNo);
		if(vehicles.contains(newVehicle))
					throw new InvalidInputException("Dup ch no !!!!!!!!!!!");
		//=> no dup found...
		System.out.println("no dups ....");

	}
	//add a static method to validate all i/ps
	//In case of success -- return the vehicle ref to the caller 
	//o.w throw the exception
	public static Vehicle validateAllInputs(String chasisNo, String vehicleColor,
			double basePrice, String manufactureDate, String company,ArrayList<Vehicle> showroom) throws InvalidInputException
	{
		checkForDup(chasisNo, showroom);
		Color clr=parseAndValidate(vehicleColor);
		LocalDate date = parseAndValidateManufactureDate(manufactureDate);
		//=> all validations successful !
		return new Vehicle(chasisNo, clr, basePrice, date, company);
	}
	
	
	
	

}
