package tester;

public class Test2 {

	public static void main(String[] args) {
		// Testing of checked exc : java.lang.InterruptedException
		System.out.println("Before sleep");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("After sleep");

	}

}
