package threads4;

import java.util.stream.IntStream;

//implements Runnable
public class EvenNoPrinterTask implements Runnable {
	private int start;
	private int end;

	public EvenNoPrinterTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		System.out.println("in ctor : by " + Thread.currentThread().getName());// main
	}

	// MUST override run() to supply thrd's exec logic
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			IntStream.rangeClosed(start, end)
			.filter(n -> n % 2 ==0)
			.forEach(n -> System.out.println("Even "+n));
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}

		System.out.println(Thread.currentThread().getName() + " over");
	}

}
