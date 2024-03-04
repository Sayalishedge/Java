package utils;

import java.time.LocalDate;
import java.util.ArrayList;

import com.productmanager.core.ProductItem;

import custom_exception.InvalidInputException;

public class ProductsUtils {

	public static ArrayList<ProductItem> populatedProducts()
	{
		ArrayList<ProductItem> list = new ArrayList<ProductItem>();
		list.add(new ProductItem("p1","biscuit",20,LocalDate.parse("2024-09-09"),100));
		list.add(new ProductItem("p2","chocolate",70,LocalDate.parse("2022-12-11"),150));
		list.add(new ProductItem("p3","butter",70,LocalDate.parse("2022-09-10"),455));
		list.add(new ProductItem("p4","bread",25,LocalDate.parse("2023-03-04"),200));
		list.add(new ProductItem("p5","jam",40,LocalDate.parse("2024-09-06"),375));
		list.add(new ProductItem("p6","jam",40,LocalDate.parse("2024-10-20"),50));
		return list;
		//add public static method to return populated list of products
	}
	
	public static void CheckForDup(ArrayList<ProductItem> list, String prodItemCode) throws InvalidInputException
	{
		ProductItem p1 = new ProductItem(prodItemCode);
		if(list.contains(p1))
			throw new InvalidInputException("Ooops.......Duplicate item!!");
		else
			System.out.println("No dup found...Enter other details.");
	}
}
