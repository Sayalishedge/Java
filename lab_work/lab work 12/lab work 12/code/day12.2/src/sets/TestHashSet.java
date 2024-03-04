package sets;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		int[] data= {10,1,10,-10,4,5,67,34,23,21,10};
		//create empty HashSet to hold Integer type of ref : HashSet<Integer>
		HashSet<Integer> hs=new HashSet<>();//size=0
		//populate the HS with data
		for(int i : data)
			System.out.println("Added "+hs.add(i));//auto boxing
		System.out.println("size of HS "+hs.size());
		System.out.println("HS "+hs);
		System.out.println("HS contains 4 "+hs.contains(4));//t
		System.out.println("HS remove 4 "+hs.remove(4));
		System.out.println("HS contains 4 "+hs.contains(4));//f
		

	}

}
