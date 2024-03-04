package test_inheritance;

import inhertance2.*;

public class Test1 {

	public static void main(String[] args) {
		//examples of direct referencing
		//=> type of the ref n type of the object : SAME
		// create student class instance
		Student student1 = new Student
				("Tanvee", "Rao", 2022, "Java", 12345, 77);
		System.out.println(student1.getDetails());
		//create faculty instance
		Faculty faculty1=new Faculty("Rama", "Rege", 10, "Java Python");
		System.out.println(faculty1.getDetails());
		
		Person person=new Person("a1", "b1");
		System.out.println(person.getDetails());

	}

}
