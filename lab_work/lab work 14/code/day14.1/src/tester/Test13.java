package tester;
import static utils.ShopUtils.populateProductList;

import java.util.List;

import com.shop.core.Category;
import com.shop.core.Product;
public class Test13 {

	public static void main(String[] args) {
		// get populated product list from utils
		List<Product> productList = populateProductList();
		//display products using FP (declarative) 
		productList.forEach(p -> System.out.println(p));
		/*
		 * display sum of prices of all the products from a specific category
		 */
		Category cat=Category.BISCUITS;
		double sum=productList.stream() //Stream<Product> : all 
		.filter(p -> p.getProductCategory().equals(cat)) //Stream<Product> : filtered
		.mapToDouble(p -> p.getPrice()) //DoubleStream : stream of product price
		.sum();
		System.out.println("Sum of products from Category "+cat+" = "+sum);

	}

}
