package tester;

import static utils.ShopUtils.populateProductList;
import static utils.ShopUtils.populateProductMap;

import java.util.Map;

import com.shop.core.Product;

public class Test6 {

	public static void main(String[] args) {
		// get populated product map from utils
		Map<Integer, Product> productMap =
				populateProductMap(populateProductList());
		//remove products with price > 50 from the map
		productMap.values() //Collection<Product>
		.removeIf(p -> p.getPrice()> 50);
		//display the map
		productMap.forEach((k,v) -> System.out.println(v));
	
	}

}
