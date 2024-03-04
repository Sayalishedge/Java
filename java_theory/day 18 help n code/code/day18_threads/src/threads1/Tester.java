package threads1;

public class Tester {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());//main,5,main
		//create thrds n test concurrency
		MyThread m1=new MyThread("one");
		MyThread m2=new MyThread("two");
		MyThread m3=new MyThread("three");
		MyThread m4=new MyThread("four");
		//main : parent + 4 child threads
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" exec # "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("main over.....");

	}

}
