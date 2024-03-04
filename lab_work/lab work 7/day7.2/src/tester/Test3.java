package tester;

public class Test3 {

	public static void main(String[] args) throws InterruptedException{
		// Testing of checked exc : java.lang.InterruptedException
		System.out.println("Before sleep");
		
			Thread.sleep(5000);
		
		System.out.println("After sleep");

	}

}
