package p1;

public class Test1 {

	public static void main(String[] args) {
		// Can you instantiate an i/f ? NO
//		Printer myPrinter=new Printer();
		//example of direct referencing
		ConsolePrinter printer1=new ConsolePrinter();
		printer1.print("Some mesg 1!");
		FilePrinter printer2=new FilePrinter();
		printer2.print("Some mesg 2");
		NetworkPrinter printer3=new NetworkPrinter();
		printer3.print("Some mesg 3");
	}

}
