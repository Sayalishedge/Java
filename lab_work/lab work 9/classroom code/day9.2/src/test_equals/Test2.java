package test_equals;

import com.acts.core.Employee;

public class Test2 {

	public static void main(String[] args) {
		Object e1 = new Employee(101, "Raj", 12345);//up casting
		Object e2 = new Employee(101, "Raj", 12345);//up casting
		System.out.println(e1.equals(e2));//t
		Object o="hello";
		System.out.println(e1.equals(o));//f
		Object e3 = new Employee(102, "Raj", 12345);
		System.out.println(e1.equals(e3));//f
		Object e4 = new Employee(101, "Riya", 12345);
		System.out.println(e1.equals(e4));//f
		Object e5 = new Employee(103, "Sam", 12345);
		System.out.println(e1.equals(e5));//f
		

	}

}
