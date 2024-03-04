package test_static;
//importing all static members of System class
import static java.lang.System.*;

public class Test1 {
	private static int i;
	private int j;
	//static init block
	static {
		out.println("in static init block "+i);
		i=100;//initing static data member
	}
	static {
		out.println("in 2nd static init block");
	}
	//add a ctor to init state (=non static data member)
	public Test1(int j) {
		this.j = j;
	}
	//add a non static method
	void show() 
	{
		out.println("from non static method "+i+" "+j);
		staticShow();
	}
	static void staticShow()
	{
		out.println("in static  method");
	//	show();
	}
	public static void main(String[] args) {
		out.println("in main");
	//	System.out.println(this);
		Test1 t1=new Test1(10);
		//static method
		staticShow();
		//non static method
		t1.show();

	}





	

}
