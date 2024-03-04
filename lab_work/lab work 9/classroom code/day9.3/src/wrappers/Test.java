package wrappers;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		int data = 100;
		// Integer i1=new Integer(data);//int --> Integer : boxing
		Integer i1 = Integer.valueOf(data);// int --> Integer : boxing
		int val = i1.intValue();// un boxing Integer --> int
		Boolean flag = Boolean.valueOf(false); // boxing
		flag = Boolean.valueOf("true");// boxing
		Integer i2 = 12345;// auto boxing
		String s = "1234";
		// s++;
		i2++;// auto un boxing(Integer --> int : intValue) --> inc --> auto boxing (int
				// -->Integer)
		System.out.println(i2);// i2.toString() : invokes overriding form of toString from Integer class --that
								// prints an int value
		double d = data;// widening conversion
		d = 123.456f;// float --> double
		// Double d1=123.45f;//float --> Float (auto boxing) --> XXXX--> Double
		Double d1 = (double) 123.45f;
		// d1=23456;
		Number n = 123.456f;// float --> Float(auto boxing) --> up casting --> Number
		System.out.println(n.getClass());
		n = 34.5678;
		// n=true;
		Object o = 100;
		o = 123.45;
		o = 12.4567f;
		o = false;
		/*
		 * Is Java pure Object oriented ? NO (since it supports primitive types also!)
		 * BUT can Object type of a reference directly refer to any type (primitive as
		 * well as ref types ? YESS
		 */
		o = LocalDate.now();// upcasting

	}

}
