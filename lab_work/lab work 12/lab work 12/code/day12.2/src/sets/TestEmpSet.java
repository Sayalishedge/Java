package sets;

import java.util.HashSet;

import com.acts.core.Employee;

public class TestEmpSet {

	public static void main(String[] args) {
		Employee e1=new Employee("rnd-001", "Rama Kher", 12345);
		Employee e2=new Employee("rnd-001", "Rama Kher", 12345);
		Employee e3=new Employee("rnd-010", "Shubham Singh", 22345);
		//create emp set(HS)
		HashSet<Employee> emps=new HashSet<>();
		System.out.println("Added "+emps.add(e1));
		System.out.println("Added "+emps.add(e2));
		System.out.println("Added "+emps.add(e3));
		System.out.println("size "+emps.size());
		System.out.println("All emps : ");
		for(Employee e : emps)
			System.out.println(e);
		
		

	}

}
