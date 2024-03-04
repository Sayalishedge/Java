package test_streams;
import static utils.CustomerUtils.getAll;

import java.util.List;
import java.util.stream.Collectors;

import com.app.core.Customer;
public class Test1 {

	public static void main(String[] args) {
		//collect the  names of all the customers in a list
		List<Customer> allCustomers = getAll();
		System.out.println("All cusotmers ");
		allCustomers.forEach(System.out::println);//c -> System.out.println(c)
		//stream -- map --forEach
		System.out.println("Names : ");
		List<String> names = allCustomers.stream()
		.map(Customer :: getName) //c -> c.getName() intermediate : converts(maps) i/p --> o/p
		//.forEach(nm -> System.out.println(nm));
		.collect(Collectors.toList());
		System.out.println(names);
	}

}
