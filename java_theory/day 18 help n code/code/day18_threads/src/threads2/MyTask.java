package threads2;
//implements Runnable
public class MyTask implements Runnable{
	
	//MUST override run() to supply thrd's exec logic
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" strted");
		try {
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+" exec # "+i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got exc "+e);
		}
		
		System.out.println(Thread.currentThread().getName()+" over");		
	}

}
