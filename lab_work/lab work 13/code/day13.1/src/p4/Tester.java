package p4;

public class Tester {

	public static void main(String[] args) {
		// add 2 numbers : 10 20 n display the sum
		System.out.println(ComputationUtils.testComputable(10, 20, new Adder()));
		// add 2 numbers : 10 20 n display the product
		System.out.println(ComputationUtils.testComputable(10, 20, new Multiplier()));
		// Can you replace line 7 : imple class by lambda expression ? YES
		System.out.println(ComputationUtils.testComputable(10, 20, (a, b) -> a + b));
		// Can you replace line 9 : imple class by lambda expression ? YES
		System.out.println(ComputationUtils.testComputable(10, 20, (a, b) -> a * b));


	}

}
