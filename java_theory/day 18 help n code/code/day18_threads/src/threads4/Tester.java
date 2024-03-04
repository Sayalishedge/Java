package threads4;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(Thread.currentThread());// main,5,main
			System.out.println("Enter begin n end of range");
			int begin = sc.nextInt();
			int end = sc.nextInt();
			// create runnable task instance -- attach it the thrd -- start the thrds
			// Thread(Runnable instance,String name)
			Thread t1 = new Thread(new EvenNoPrinterTask(begin, end), "even");
			Thread t2 = new Thread(new OddNoPrinterTask(begin, end), "odd");
			Thread t3 = new Thread(new SumPrinterTask(begin, end), "sum");
			t1.start();
			t2.start();
			t3.start();
			System.out.println("main waiting for child thrds to complete exec");
			t1.join();// main is waiting for t1 to complete it's exec
			t2.join();
			t3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over.....");

	}

}
