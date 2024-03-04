package test_equals;

import com.acts.core.Employee;

public class Test2 {

	public static void main(String[] args) {
		Object e1 = new Employee(101, "Raj", 12345);//up casting
		Object e2 = new Employee(101, "Raj", 12345);//up casting
		System.out.println(e1.equals(e2));//t
		Object o="hello";
		System.out.println(e1.equals(o));

	}

}
