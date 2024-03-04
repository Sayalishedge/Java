package utils;

import java.time.LocalDate;

import custom_exception.LicenseExpiredException;
import custom_exception.SpeedOutOfRangeException;

public class ValidationRules {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED = 40;
		MAX_SPEED = 80;
	}

//add a static method for speed validation
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow !!!!");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("You are driving too fast , FATAL !!!!!");
		System.out.println("Speed within range....");
	}
	// add a static method for license exp date validation
	// i/p : string , o/p : in case of success --LocalDate , in case of err -->
	// throw the exc
	public static LocalDate checkLicense(String expDate) throws LicenseExpiredException
	{
		//parse , string --> LocalDate
		LocalDate date=LocalDate.parse(expDate);
		//=> parsing succes
		if(date.isBefore(LocalDate.now())) //=> expired
			throw new LicenseExpiredException("License Expired!!!!");
		System.out.println("valid license.....");
		return date;
		
	}
	//add a method to validate all i/ps
	public static void validateAllInputs(int sp,String date) 
			throws SpeedOutOfRangeException,LicenseExpiredException
	{
		validateSpeed(sp);
		checkLicense(date);
	}
	
	
	
	

}
