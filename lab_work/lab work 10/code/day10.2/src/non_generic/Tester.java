package non_generic;

public class Tester {

	public static void main(String[] args) {
		// create Holder class instance to hold int value : 12345
		Holder intHolder=new Holder(12345);//int --> Integer ---> Object
		//extract int value from the holder
		int data=(Integer)intHolder.getRef();//expl : downcasting , impl : auto un boxing
		System.out.println(intHolder.getRef().getClass());//java/lang.Integer
		
		// create Holder class instance to hold a string : "hello"
		Holder stringHolder=new Holder("hello");//up casting
		//extract  string from the holder
		String s=(String)stringHolder.getRef();
		//display name of the class loaded for the string holder's ref.
		System.out.println(stringHolder.getRef().getClass());//java.lang.String
		intHolder=stringHolder;
		data=(Integer)intHolder.getRef();
		System.out.println(data);
		

	}

}
