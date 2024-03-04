package p1;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// Display all integers from Integer List
		List<Integer> list=Arrays.asList(10,20,30,1,2,3,4,5);
		//Iterable : public void forEach(Consumer<? super T> action)
		//java.util.fucntion.Consumer : Func i/f : YES : 
		//SAM : public void accept(T t)
		//forEach : applies the action on all elems of this collection
		list.forEach(i -> System.out.print(i+" "));
	}

}
