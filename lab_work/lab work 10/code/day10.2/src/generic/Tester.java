package generic;

public class Tester {

	public static void main(String[] args) {
		// create Holder class instance to hold int value : 12345
		Holder<Integer> intHolder=new Holder<>(12345);//int ---> Integer
	
		//extract int value from the holder
		int data=intHolder.getRef();//Integer --> int
		
		// create Holder class instance to hold a string : "hello"
		Holder<String> stringHolder=new Holder<>("hello");//NO impl conversion by javac
			//extract  string from the holder
		String s=stringHolder.getRef();		
//		intHolder=stringHolder;//javac err : incompatible types , 
		//since Holder<String> is NOT compatible with Holder<Integer>
		
		
		//display name of the class loaded for the string holder's ref.
		
		

	}

}
