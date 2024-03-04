package test_equals;

import com.acts.core.Employee;

public class Test1 {

	public static void main(String[] args) {
		Employee e1=new Employee(101, "Raj", 12345);
		Employee e2=new Employee(101, "Raj", 12345);
		Employee e3=e1;
		System.out.println(e1==e2);//f
		System.out.println(e1==e3);//t
		System.out.println(e1.equals(e2));//f => Object class's equals
		//method is based upon ref equality(==)
		//After overriding equals method based upon emp id : should ret true
		System.out.println(e1.equals(e3));//t 
		Employee e4=new Employee(102, "Raj", 12345);
		System.out.println(e1.equals(e4));//f : based upon emp id equality 
	}

}
