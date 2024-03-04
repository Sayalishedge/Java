package sets;

import java.util.LinkedList;
import java.util.TreeSet;

public class TestTreeSetNaturalOrdering {

	public static void main(String[] args) {
		int[] data = { 10, 1, 10, -10, 4, 5, 67, 34, 23, 21, 10 };
		// Can you create a populated LinkedList from above data ? YES
		LinkedList<Integer> list = new LinkedList<>();
		for (int i : data)
			list.add(i);
		System.out.println("Linked List " + list);
		// Can you use this linked list to create a populated TS , asc order of ints?
		// YES

		TreeSet<Integer> ts = new TreeSet<>(list);
		// JVM will invoke Integer class's compareTo method for sorting
		System.out.println("TreeSet " + ts);

	}

}
