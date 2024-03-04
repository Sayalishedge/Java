package tester;

import java.util.Arrays;
import java.util.List;

public class Test8 {

	public static void main(String[] args) {
		// Stream the data from int[] n display it
		int[] data= {10,20,40,1,3,4,5,6,7};
		Arrays.stream(data) //IntStream		
		.forEach(i -> System.out.print(i+" "));
		System.out.println();
		System.out.println("stream() ");
		//Stream the data from a Collection , in a seq. manner n display it 
		List<Integer> list=Arrays.asList(12,2,4,5,7,8,1,2);
		list.stream() //Stream<Integer>
		.forEach(i -> System.out.print(i+" "));
		//Stream the data from a Collection , in a parallel. manner n display it
		System.out.println();
		System.out.println("parallelStream()");
		list.parallelStream() //Stream<Integer>
		.forEach(i -> System.out.print(i+" "));
		
		
	}

}
