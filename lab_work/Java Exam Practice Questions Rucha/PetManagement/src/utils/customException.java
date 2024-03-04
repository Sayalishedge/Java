package utils;
import java.util.HashMap;

import core.*;
import exceptions.invalidInputArgument;
public class customException {
	public static boolean authenticateCustomer(String username, String password) {
		if(username.equalsIgnoreCase("c1") && password.equalsIgnoreCase("c1")) {
			//System.out.println("Login successful");
			return true;
		}
		return false;
	}
	
	public static boolean authenticateAdmin(String username, String password){
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			//System.out.println("Login successful");
			return true;
		}
		return false;
	}
	
	public static void checkPetId(Integer id, HashMap<Integer, Pet> pets) throws invalidInputArgument{
		if(pets.containsKey(id)) {
			System.out.println("Pet Id authenticated...");
			return;
		}
		throw new invalidInputArgument("No pet Id detected...");
	}
	
	public static Order checkOrderId(Integer id, HashMap<Integer, Order> orders) throws invalidInputArgument{
		if(orders.get(id)==null)
			throw new invalidInputArgument("No order Id detected...");
		return orders.get(id);
	}
	
	public static boolean checkPetStock(int id, int quantity, HashMap<Integer, Pet> pets) throws invalidInputArgument{
		Pet p = pets.get(id);
		if(p.getStocks()<quantity)
			throw new invalidInputArgument("Pet out of stock...");
		return true;
			
	}
	
	public static void updatePetStock(int id, int quantity,HashMap<Integer, Pet>pets) {
		Pet p = pets.get(id);
		p.setStocks(p.getStocks()-quantity);
	}
	
}
