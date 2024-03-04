package sets;

import java.util.LinkedList;
import java.util.TreeSet;

import custom_ordering.IntegerDescComparator;

public class TestTreeSetCustomOrdering {

	public static void main(String[] args) {
		int[] data = { 10, 1, 10, -10, 4, 5, 67, 34, 23, 21, 10 };
		// Can you create a populated LinkedList from above data ? YES
		LinkedList<Integer> list = new LinkedList<>();
		for (int i : data)
			list.add(i);
		System.out.println("Linked List " + list);
		// Can you use this linked list to create a populated TS , desc order of ints?
		// YES
		//arg : instance of the class that imple Comparator(Comparator instance)
		TreeSet<Integer> ts=new TreeSet<>(new IntegerDescComparator());
		System.out.println(ts);
		ts.addAll(list);
		System.out.println(ts);
		
		

	}

}
