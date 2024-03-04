package test_inheritance;

import inhertance2.*;

public class Test3 {

	public static void main(String[] args) {
		//example of indirect referencing
//		Person p;//=> super cls ref
//		//super cls ref can DIRECTLY refer to any sub class instance (up casting)
//		p=new Student("Tanvee", "Rao", 2022, "Java", 12345, 77);//up casting : auto conversion by javac
//		System.out.println(p.getDetails());
//		p=new Faculty("Rama", "Rege", 10, "Java Python");//up casting
//		System.out.println(p.getDetails());
		Person p=new Person("a1", "b1");
		System.out.println(p);//javac implicitly invokes p.toString()
		Object o;// ref : Object
		o=p; //up casting
		System.out.println(o);//prints fn n ln (JVM : toString : Person)
		//Person p =new Student(....);
		//sop(p); --> should print student's comlepte details
		p=new Student("Tanvee", "Rao", 2022, "Java", 12345, 77);//up casting
		System.out.println(p);//student details
		p=new Faculty("Rama", "Rege", 10, "Java Python");
		System.out.println(p);//faculty's details

	}

}
