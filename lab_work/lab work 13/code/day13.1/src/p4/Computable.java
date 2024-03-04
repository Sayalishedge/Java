package p4;

@FunctionalInterface
public interface Computable {
//add a method declaration that can perform ANY 
	//arithmetic operation on 2 double operands
	//public abstract
	double performOperation(double a , double b);
	//Can you add to this func i/f : default n static methods : YES
	default void show()
	{
		System.out.println("in show");
	}
	static boolean test()
	{
		return true;
	}
}
