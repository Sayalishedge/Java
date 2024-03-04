package tester;
import static utils.ShopUtils.populateProductList;

import java.util.Collections;
import java.util.List;

import com.shop.core.Product;
public class Test7 {

	public static void main(String[] args) {
		// get populated product list from utils
		List<Product> productList = populateProductList();
		//display products using FP (declarative) 
		System.out.println("orig list");
		productList.forEach(p -> System.out.println(p));//ordered list
		//Collections.sort(List<T> list, Comparator<? super T> comp)
		//Comprator : func i.f : YES
		//SAM : public int compare(T o1,T o2)
		Collections.sort(productList, (p1,p2) ->
		p1.getManufactureDate().compareTo(p2.getManufactureDate()));
		System.out.println("sorted list");
		productList.forEach(p -> System.out.println(p));
	

	}

}
