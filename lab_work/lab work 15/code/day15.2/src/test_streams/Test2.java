package test_streams;

import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		//rets IMMUTABLE list from var-args
		List<Double> doubleNums=List.of(1.0,2.4,3.1,4.45,5.56,10.12);
	//	doubleNums.add(0,12.34);
	//	doubleNums.remove(0);
	//	doubleNums.set(0, 9.99); run time err : UnSupportedOPExc
		doubleNums.forEach(d -> System.out.print(d+" "));
	}

}
