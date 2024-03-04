package tester;

import java.util.stream.IntStream;

public class Test12 {

	public static void main(String[] args) {
		// Display sum of all odd integers between 5-100
		int sum=IntStream.range(5,101)
				.filter(i -> i % 2 != 0)
				.sum();
		System.out.println("Sum of odd nos : "+sum);

	}

}
