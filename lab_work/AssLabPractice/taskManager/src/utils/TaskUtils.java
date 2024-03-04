package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import core.Status;
import core.Task;
import customException.InvalidInputException;




public class TaskUtils {
	
	
		
		
		
	
	
	
	public static String parseAndValidateStatus(String status) throws InvalidInputException{
		return Status.valueOf(status.toUpperCase());
	}



	public static LocalDate parseAndValidateDate(String date) throws InvalidInputException {
		return LocalDate.parse(date);
		
		
	}

}
