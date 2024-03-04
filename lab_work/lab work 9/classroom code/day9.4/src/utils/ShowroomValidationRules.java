package utils;

import java.time.LocalDate;

import custom_exceptions.InvalidInputException;

import static java.time.LocalDate.*;

public class ShowroomValidationRules {
//add a public static method to validate --
	// manufactureDate : must be after 1st Jan 2020
	public static LocalDate parseAndValidateManufactureDate(String date) 
			throws InvalidInputException {
		LocalDate d1 = parse(date);
		// => parsing successful , now do the validation
		if (d1.isAfter(of(2020, 1, 1)))
			return d1;
		// => old vehicle , throw custom exc
		throw new InvalidInputException("Manufacture date must be after 1st Jan 2020");
	}
}
