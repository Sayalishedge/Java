package threads3;

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
			for (int i = start; i <= end; i++) {
				if (i % 2 == 0)
					System.out.println("Next Even No " + i);
				Thread.sleep(50);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}

		System.out.println(Thread.currentThread().getName() + " over");
	}

}
