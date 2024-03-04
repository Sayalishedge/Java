package tester;

import static utils.ShopUtils.populateProductList;
import static utils.ShopUtils.populateProductMap;

import java.util.Map;

import com.shop.core.Product;


public class Test3 {

	public static void main(String[] args) {
		// Display entries from the product map
		// get product map
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		// Map i/f : higher order function : public void forEach(BiConsumer<K,V> action)
		// BiConsumer : Func i/f --> can be replaced by lambda
		// Func method : public void accept(K k,V v)
		productMap.forEach((k, v) -> 
		System.out.println("Product Id " + k + " Details " + v));

	}

}
