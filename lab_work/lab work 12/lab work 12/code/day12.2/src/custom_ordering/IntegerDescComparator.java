package custom_ordering;

import java.util.Comparator;

public class IntegerDescComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.println("in compare : desc");
		// Since Integer class implements Comparable<Integer> , 
		//simply invoke the method , using swapped args for desc order
		return o2.compareTo(o1);
	}

}
