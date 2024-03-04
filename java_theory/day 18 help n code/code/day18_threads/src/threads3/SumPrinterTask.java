package threads3;

//implements Runnable
public class SumPrinterTask implements Runnable {
	private int start;
	private int end;

	public SumPrinterTask(int start, int end) {
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
			int sum=0;
			for (int i = start; i <= end; i++) {
				sum += i;
				Thread.sleep(50);
			}
			System.out.println("Sum "+sum);
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}

		System.out.println(Thread.currentThread().getName() + " over");
	}

}
