package tester;

import static utils.ShopUtils.populateProductList;

import java.util.List;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test10 {

	public static void main(String[] args) {
		// get populated product list from utils
		List<Product> productList = populateProductList();
		// display products using FP (declarative)
		System.out.println("All products : ");
		productList.forEach(p -> System.out.println(p));
		// display all the products from the specified category -- in a single java
		// stmt(using Stream API)
		Category cat = Category.FRUITS;
		System.out.println("Products from Category "+cat);
		productList.stream() //Stream<Product>
		.filter(p -> p.getProductCategory().equals(cat)) //Stream<Product> : filtered prods
		.forEach(p1 -> System.out.println(p1));
		

	}

}
