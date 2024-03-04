package inheritance;

public class C extends B {
	public C() {
	//	super(); added implicitly by javac
		System.out.println("in C's ctor");
	}
}
