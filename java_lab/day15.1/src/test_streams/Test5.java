package test_streams;

import static utils.ShopUtils.populateProductList;

import java.util.List;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

//check if the shop contains any products under the specified category
public class Test5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get all product list
			List<Product> productList = populateProductList();
			System.out.println("Shop contains ");
			productList.forEach(p -> System.out.println(p));
			System.out.println("Enter category name");
			Category cat=Category.valueOf(sc.next().toUpperCase());
			boolean found = productList.stream() //Stream<Product>		
			.anyMatch(p -> p.getProductCategory().equals(cat));
			System.out.println(found?"Non Empty ":"Empty "+" Catgeory");
		}

	}

}
