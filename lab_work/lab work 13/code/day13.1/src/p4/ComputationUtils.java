package p4;

public interface ComputationUtils {
/*
 *  Create utility i/f :  ComputationUtils :  to add a static method
to return  result of  ANY operation performed on 2 double operands

 */
	static double testComputable(double d1,double d2,Computable operation)
	{
		return operation.performOperation(d1, d2);
	}
}
