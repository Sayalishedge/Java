package iterators;

import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		// create a HashSet of Strings n populate the same
		HashSet<String> stringSet=new HashSet<>();
		stringSet.add("one");
		stringSet.add("two");
		stringSet.add("three");
		stringSet.add("four");
		stringSet.add("five");
		stringSet.add("six");
		System.out.println("size of HS "+stringSet.size());//6
		//attach an iterator n display all the strings
		System.out.println("Printing HS elems using Iterator");
		Iterator<String> itr=stringSet.iterator();//itr --> before the 1st elem
		while(itr.hasNext())
			System.out.println(itr.next());
	//	System.out.println(itr.next()); throws NoSuchElemExc
		//remove all the strings from the HS , with str len > 3
		//Hint : remove()
		//re attach the Iterator
		itr=stringSet.iterator();
		while(itr.hasNext())
			if(itr.next().length()>3)
				itr.remove();
		System.out.println("HS again "+stringSet);
		

	}

}
