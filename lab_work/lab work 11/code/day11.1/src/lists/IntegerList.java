package lists;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Create empty list of integers.
Populate it with some values : 10 , 20 , 30 ,40 ,50
Display the list : using toString n for-each
get a particular element : get
Search for the specific element : contains 
indexOf , lastIndexOf
chk if the list(AL) is it growable : append / insert
delete element
sorting the list
 */
public class IntegerList {

	public static void main(String[] args) {
		// Create empty list of integers.
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("AL def contents : ");
		for(int i : list)//auto un boxing
			System.out.println(i);
		//size=0, init capa=10
		int[] ints= {10,20,1,31,-10,10,30,4,56,67,13,23};
		for(int i : ints)
			list.add(i);//auto boxing
	
		System.out.println("list contents via toString"+list);
		//Can u attach for-each to the ArrayList ?
		System.out.println("list contents via for-each");
		for(int i : list)//auto un boxing
			System.out.println(i);
		//get the elem by it's index : 
		System.out.println("5th elem "+list.get(6));//O(1) => constant time performance
		//searching for elem
		System.out.println("does list contain 40 : "+list.contains(40));//f
		//display the index of 1st n last occurrence of 10
		System.out.println("1st n last occurrence of 10 :  "
		+list.indexOf(10)+" "+list.lastIndexOf(10));
		//insert 999 at index 0
		list.add(0, 999);
		System.out.println("list contents via toString"+list);
		//replace 3rd elem by it's double
		System.out.println("replaced "+list.set(4,list.get(4)*2));
		System.out.println("list again "+list);
		//remove 4th elem n display the list again
		System.out.println("removed "+list.remove(4));
		System.out.println("list after remove "+list);
		//sort the list
		Collections.sort(list);
		System.out.println("sorted list "+list);
		
	}

}
