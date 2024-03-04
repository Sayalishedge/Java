package tester;
import static utils.ShopUtils.populateProductList;

import java.util.Iterator;
import java.util.List;

import com.shop.core.Category;
import com.shop.core.Product;
public class Test5 {

	public static void main(String[] args) {
		// get populated product list from utils
		List<Product> productList = populateProductList();
		//display products using FP (declarative) 
		productList.forEach(p -> System.out.println(p));
		//currently hard coding the category
		Category category=Category.BREAD;
		//remove products from specific category
//		for(Product p : productList)
//			if(p.getProductCategory().equals(category))
//				productList.remove(p); //ConcModiExc
//		Iterator<Product> productItr=productList.iterator();
//		while(productItr.hasNext())
//		{
//			Product p=productItr.next();
//			if (p.getProductCategory().equals(category))
//				productItr.remove();
//		} : imperative style soln
		
		/*
		 * Collection i/f method : public boolean removeIf(Predicate<T> filter)
		 * If the filtering condition rets true --> elem will be removed
		 * Predicate : func i/f
		 * SAM : public boolean test(T t)
		 */
		productList.removeIf(prod -> 
		prod.getProductCategory().equals(category));
		System.out.println("List after remove : ");
		productList.forEach(p -> System.out.println(p));

	}

}
