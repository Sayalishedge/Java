package runnable_tasks;

import com.app.core.JointAccount;

//check the balance of the SAME joint acct
public class Customer2 implements Runnable {
	private JointAccount account;
	

	public Customer2(JointAccount account) {
		super();
		this.account = account;
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" strted");
		try {
			while(true) {
				double balance = account.checkBalance();
				if(balance != 10000)
				{
					System.out.println("ERROR!!!!!!!!!!!!!");
					System.exit(-1);
					
				}
				Thread.sleep(111);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got error "+e);
		}
		System.out.println(Thread.currentThread().getName()+" over");

	}

}
