package test_inheritance;

import inhertance2.Faculty;
import inhertance2.Person;
import inhertance2.Student;

public class Test4 {

	public static void main(String[] args) {
		Person o=new Student("Tanvee", "Rao", 2022, "Java", 12345, 77);//up casting
		System.out.println(o);
		o=new Faculty("Rama", "Rege", 10, "Java Python");
		System.out.println(o);

	}

}
