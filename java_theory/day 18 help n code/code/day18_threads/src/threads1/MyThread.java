package threads1;
//extends Thread scenario
public class MyThread extends Thread{
	public MyThread(String name) {
		super(name);//New Thread : with specified name
		start();//RUNNABLE(rdy to run / running)
	}
	//MUST override run() to supply thrd's exec logic
	@Override
	public void run() {
		System.out.println(getName()+" strted");
		try {
			for(int i=0;i<10;i++)
			{
				System.out.println(getName()+" exec # "+i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(getName()+" got exc "+e);
		}
		
		System.out.println(getName()+" over");		
	}

}
