package test_static;
//importing all static members of static class
import static java.lang.System.*;




public class Test1 {
	private static int i;
	private int j;
	//static initializer block
	static {
		out.println("in static block 1" + i);
		
	}
	static {
		out.println("in static block 2");
		
	}
	//add a constructor to initialize the state(non static data member)
	public Test1(int j) {
		super();
		this.j = j;
	}
	
	//add a non static method
	void show()
	{
		System.out.println("From show() non static method" +i+" "+j);
		
	}
	static void staticShow()
	{
		System.out.println("From show() static method");
		//show();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main");
		Test1 t1 = new Test1(10);//10 is passed as j
		//static method
		staticShow();
		//non static method
		t1.show();
		
		
		
		
	}
	

}
