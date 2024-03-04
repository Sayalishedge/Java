package tester;
//3. Create stream of ints between 1-100 & display all even elements.
import java.util.stream.IntStream;

public class Test9 {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100) //IntStream : 1---100
		.filter(i -> i % 2 ==0) //IntStream : 2,4 6,8...100 : intermediate 
		.forEach(i  -> System.out.println(i)); //terminal
	}
}
