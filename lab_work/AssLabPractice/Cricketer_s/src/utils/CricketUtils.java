package utils;

import java.util.ArrayList;

import core.Cricketer;
import customException.CustomException;

public class CricketUtils {
	
	
	public static Cricketer findByName(String name, ArrayList<Cricketer> list) throws CustomException{
		Cricketer c1 = new Cricketer(name);
		int index = list.indexOf(c1);
		if(index == -1)
			throw new CustomException("Invalid name");
		return list.get(index);
		
	}

}
