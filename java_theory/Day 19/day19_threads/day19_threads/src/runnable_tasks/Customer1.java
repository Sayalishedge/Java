package runnable_tasks;

import com.app.core.JointAccount;

//update the balance of the joint acct
public class Customer1 implements Runnable {
	private JointAccount account;
	

	public Customer1(JointAccount account) {
		super();
		this.account = account;
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" strted");
		try {
			while(true) {
				account.updateBalance(5000);
				Thread.sleep(111);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got error "+e);
		}
		System.out.println(Thread.currentThread().getName()+" over");

	}

}
