package p1;

public class Test2 {

	public static void main(String[] args) {
		//indirect referencing
		
		Printer myPrinter;//i/f type of ref variable
		//can i/f ref var DIRECTLY (w/o type casting)
		//refer to ANY imple class instance? YES
		
		myPrinter =new ConsolePrinter();//upcasting
		myPrinter.print("some message in 1!");
		

		myPrinter.print("some message");
		
		myPrinter  = new FilePrinter();
		myPrinter.print("some message in file ");
		
		myPrinter = new NetworkPrinter();
		myPrinter.print("some message in Network ");
	}

}
