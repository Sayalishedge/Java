package p1;

public class Test2 {

	public static void main(String[] args) {
	//indirect referencing
		Printer myPrinter;//i/f type of ref variable
	//	System.out.println(myPrinter);
		//Can i/f ref var DIRECTLY(w/o type casting)
		//refer to ANY imple class instance ? YES
		myPrinter=new ConsolePrinter();//up casting
		myPrinter.print("Some mesg 1!");
		myPrinter=new FilePrinter();
		myPrinter.print("Some mesg 2");
		myPrinter=new NetworkPrinter();
		myPrinter.print("Some mesg 3");
	}

}
