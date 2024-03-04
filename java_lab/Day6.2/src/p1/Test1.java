package p1;

public class Test1 {

	public static void main(String[] args) {
		//can you instantiate an i/f ? NO
		//Printer myPrinter = new Printer();
		
		//example of direct referencing
		ConsolePrinter printer1 = new ConsolePrinter();
		printer1.print("some message");
		
		FilePrinter fp1 = new FilePrinter();
		fp1.print("some message in file ");
		
		NetworkPrinter np1= new NetworkPrinter();
		np1.print("some message in Network ");
	}

}
