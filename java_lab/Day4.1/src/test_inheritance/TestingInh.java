package test_inheritance;

import inheritance2.*;

public class TestingInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Sayali", "Shedge",2023,"DBDA",90000,90);
		System.out.println(s1.getDetails());
		
		Faculty s2 = new Faculty("Sapana", "Shinde",9,"sme");
		System.out.println(s2.getDetails());		
		
		

	}

}
