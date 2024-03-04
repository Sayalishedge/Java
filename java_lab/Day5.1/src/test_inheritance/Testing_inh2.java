package test_inheritance;

import inheritance2.*;//ctrl+shift+o - importing 

public class Testing_inh2 {
	
	public static void main(String[] args){
		Person p; //superclass reference
		//super class reference can directly refer to any sub class instance (up casting)
		
		 p = new Student("Sayali", "Shedge", 2023, "DBDA", 90000, 90);
		 System.out.println(p.getDetails());
		 
		
		
		
		
		
	}
	

}
