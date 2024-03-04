package utils;

import java.util.HashMap;

import com.pets.core.Order;
import com.pets.core.Status;

import custom_exception.AuthenticationException;
import custom_exception.AuthorizationException;

public class AdminUtils {
	
	public static HashMap<String, String> popAdmins()
	{
		HashMap<String, String> admins = new HashMap<String, String>();
		admins.put("Srush", "1010");
		admins.put("Joe", "5555");
		admins.put("Niklaus", "8888");
		return admins;
		
	}
	
	//check authorization
	public static boolean checkAdmins(String u, String p) throws AuthorizationException, AuthenticationException
	{
		HashMap<String, String> adm = popAdmins();
		if(adm.containsKey(u))
			if(adm.get(u).equals(p))
				return true;
		throw new AuthorizationException("Oops..Wrong credentials. Access Denied!!! ");
	}
	
	public static HashMap<Integer, Order> popOrders()
	{
		HashMap<Integer, Order> orders = new HashMap<Integer, Order>();
		Order o1 = new Order(1201, 1, 1, Status.valueOf("placed".toUpperCase()));
		Order o2 = new Order(1202, 2, 1, Status.valueOf("placed".toUpperCase()));
		Order o3 = new Order(1203, 3, 1, Status.valueOf("placed".toUpperCase()));
		orders.put(o1.getOrder_id(), o1);
		orders.put(o2.getOrder_id(), o2);
		orders.put(o3.getOrder_id(), o3);
		return orders;
		
	}

}
