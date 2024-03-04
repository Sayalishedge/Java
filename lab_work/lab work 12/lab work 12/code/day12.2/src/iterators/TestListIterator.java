package iterators;

import java.util.ListIterator;
import java.util.Vector;

public class TestListIterator {

	public static void main(String[] args) {
		Vector<String> stringVector=new Vector<>();
		stringVector.add("one");
		stringVector.add("two");
		stringVector.add("three");
		stringVector.add("four");
		stringVector.add("five");
		stringVector.add("six");
		stringVector.add("seven");
		stringVector.add("eight");
		System.out.println(stringVector);
		//print this list in reverse order
		ListIterator<String> listItr=stringVector.listIterator(stringVector.size());
		while(listItr.hasPrevious())
			System.out.println(listItr.previous());

	}

}
