package method_overloading;

public class Test1 {

	
	void print(byte b) {
		System.out.println("printing a byte");
		
	}
	void print(int b1) {
		System.out.println("printing an int");
		
	}
	void print(double b1) {
		System.out.println("printing s double");
		
	}
	/*
	 * void print(float b1) { System.out.println("printing s float");
	 * 
	 * }
	 */
	void print(double b1,double b2) {
		System.out.println("printing s double with 2 args");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Test1 t1 = new Test1(); t1.print(100);
		 */
		
		Test1 t1 = new Test1();
		long b1 = 1007686;
		t1.print(b1);
		
		
	}

}
