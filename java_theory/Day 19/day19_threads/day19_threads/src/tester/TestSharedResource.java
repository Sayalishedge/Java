package tester;

import com.app.core.JointAccount;

import runnable_tasks.Customer1;
import runnable_tasks.Customer2;

public class TestSharedResource {

	public static void main(String[] args) throws InterruptedException{
		//create joint account instance
		JointAccount acct=new JointAccount(10000);
		//create thrds n start
		Thread t1=new Thread(new Customer1(acct), "cust1");//update
		Thread t2=new Thread(new Customer2(acct), "cust2");//check
		t1.start();
		t2.start();
		System.out.println("Main waiting for child thrds...");
		t1.join();
		t2.join();
		System.out.println("main over....");

	}

}
