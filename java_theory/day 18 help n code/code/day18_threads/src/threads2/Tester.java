package threads2;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());// main,5,main
		// create runnable task instance
		MyTask task = new MyTask();
		// create thrds n test concurrency
		// Thread(Runnable instance,String name)
		Thread t1 = new Thread(task, "one");
		Thread t2 = new Thread(task, "two");
		Thread t3 = new Thread(task, "three");
		t1.start();
		t2.start();
		t3.start();
		// main : parent + 3 child threads
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec # " + i);
			Thread.sleep(250);
		}
		System.out.println("main waiting for child thrds to complete exec");
		System.out.println("t1 is alive"+t1.isAlive());//t
		t1.join();//main is waiting for t1 to complete it's exec
		System.out.println("t1 is alive"+t1.isAlive());//f
		t2.join();
		t3.join();
		System.out.println("main over.....");

	}

}
