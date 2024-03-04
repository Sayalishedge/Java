package utils;
import java.util.Map;
import java.util.HashMap;
import com.cricketer.core.Cricketer;

import custom_exception.InvalidInputException;


public class CricketerUtils {
	
	public static void checkForDups(String name, Map<String, Cricketer> cricketer)throws InvalidInputException
	{
		if(cricketer.containsKey(name))
			throw new InvalidInputException("Player already Exists!!!");
		else
			System.out.println("New Player Added");
	}
	

}
