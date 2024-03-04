package sets;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		int[] data= {10,1,10,-10,4,5,67,34,23,21,10};
		//create empty LinkedHashSet to hold Integer type of ref : LinkedHashSet<Integer>
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();//size=0
		//populate the HS with data
		for(int i : data)
			System.out.println("Added "+hs.add(i));//auto boxing
		System.out.println("size of HS "+hs.size());
		System.out.println("HS "+hs);//ordered o/p
		System.out.println("HS contains 4 "+hs.contains(4));//t
		System.out.println("HS remove 4 "+hs.remove(4));
		System.out.println("HS contains 4 "+hs.contains(4));//f
		

	}

}
