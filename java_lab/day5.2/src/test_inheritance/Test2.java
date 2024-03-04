package test_inheritance;

import inhertance2.*;

public class Test2 {

	public static void main(String[] args) {
		//example of indirect referencing
		Person p;//=> super cls ref
		//super cls ref can DIRECTLY refer to any sub class instance (up casting)
		p=new Student("Tanvee", "Rao", 2022, "Java", 12345, 77);//up casting : auto conversion by javac
		System.out.println(p);
		p=new Faculty("Rama", "Rege", 10, "Java Python");//up casting
		System.out.println(p);

	}

}
