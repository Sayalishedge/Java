package method_overloading;

public class Test1 {

	void print(byte b) {
		System.out.println("printing a byte");
	}

	void print(short b1) {
		System.out.println("printing a short");

	}

	void print(int b1) {
		System.out.println("printing an int");

	}
	
	void print(float b1) {
		System.out.println("printing a float");

	}

	void print(double b1) {
		System.out.println("printing a double");

	}
	void print(double b1,double b2) {
		System.out.println("printing a double");

	}
	
	

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		float b1=10034566;
		t1.print(b1);
		long l1=2345678;
		t1.print(l1);

	}

}
