package sets;

import java.util.HashSet;

import com.acts.core.Employee;

public class TestMe {

	public static void main(String[] args) {
		Employee e1=new Employee("rnd-001", "Rama Kher", 12345);
		Employee e2=new Employee("rnd-002", "Rama Kher", 12345);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode()+" "+e2.hashCode());

	}

}
