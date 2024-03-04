package test_streams;
import static utils.CustomerUtils.getAll;

import java.util.List;
import java.util.stream.Collectors;

import com.app.core.Customer;
public class Test3 {

	public static void main(String[] args) {
		//collect the  phone nos  of all the customers in a list
		List<Customer> allCustomers = getAll();
		System.out.println("All cusotmers ");
		allCustomers.forEach(System.out::println);
		//stream -- map --forEach
		System.out.println("Phone nos : ");
		  List<String> phoneNos = allCustomers.stream()
		.flatMap(c -> c.getPhoneNumbers().stream()) //maps Customer --> Stream (ph nos)
		//.forEach(nm -> System.out.println(nm));
		.collect(Collectors.toList());
		 System.out.println(phoneNos);
		
	}

}
