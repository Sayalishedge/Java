package utils;

import java.util.HashMap;

import custom_exception.AuthenticationException;
import custom_exception.AuthorizationException;

public class CustomerUtils {
	
	public static HashMap<String, String> popCust()
	{
		HashMap<String, String> cust =new HashMap<String, String>();
		cust.put("Alexa", "1111");
		cust.put("Siri", "2222");
		cust.put("Natashs", "3333");
		return cust;
		
	}
	
	public static boolean checkCus(String u, String p) throws AuthorizationException, AuthenticationException
	{
		HashMap<String, String> cus = popCust();
		if(cus.containsKey(u))
			if(cus.get(u).equals(p))
				return true;
		throw new AuthorizationException("Wrong Credentials!!!...Access Denied!!");
	}

}
