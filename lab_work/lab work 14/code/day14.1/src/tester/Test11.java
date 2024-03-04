package tester;

import static utils.ShopUtils.populateProductList;

import java.util.List;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test11 {

	public static void main(String[] args) {
		// get populated product list from utils
		List<Product> productList = populateProductList();
		// display products using FP (declarative)
		System.out.println("All products : ");
		productList.forEach(p -> System.out.println(p));
		/*
		 * display all the products from the specified category sorted as per desc order
		 * of price , in a single java stmt(using Stream API)
		 */
		Category cat = Category.FRUITS;
		System.out.println("Sorted Products from Category " + cat + " as per desc price");
		productList.stream() // Stream<Product>
				.filter(p -> p.getProductCategory().equals(cat)) // Stream<Product> : filtered prods
//				.sorted((p1, p2) -> {
//					if (p1.getPrice() < p2.getPrice())
//						return 1;
//					if(p1.getPrice()==p2.getPrice())
//						return 0;
//					return -1;
//				}
				.sorted((p1, p2) -> ((Double) p2.getPrice()).compareTo(p1.getPrice())
				).//Sorted n Filtered Stream<Product>
				forEach(p1 -> System.out.println(p1));

	}

}
