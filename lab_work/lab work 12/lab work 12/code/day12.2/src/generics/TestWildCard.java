package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class TestWildCard {

	public static void main(String[] args) {
		// create AL of integers : 10, 20 , 30 , 40 ,50
		ArrayList<Integer> list1=new ArrayList<>();
		int[] data= {10,20,30,40,50};
		for(int i : data)
			list1.add(i);
		System.out.println("orig list "+list1);
		Collections.shuffle(list1);
		System.out.println("shuffled list "+list1);
		//shuffle n display
		//create LinkedList of String : one ,two ....five
		LinkedList<String> list2=new LinkedList<>(Arrays.asList("one",
				"two","three","four","five"));
		System.out.println("orig list "+list2);
		//shuffle n display
		Collections.shuffle(list2);
		System.out.println("shuffled list "+list2);

	}

}
