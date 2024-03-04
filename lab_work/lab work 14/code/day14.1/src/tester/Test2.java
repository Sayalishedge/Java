package tester;
import static utils.ShopUtils.populateProductList;

import java.util.List;

import com.shop.core.Product;
public class Test2 {

	public static void main(String[] args) {
		// get populated product list from utils
		List<Product> productList = populateProductList();
		//display products using FP (declarative) 
		productList.forEach(p -> System.out.println(p));

	}

}
