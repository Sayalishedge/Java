package p1;

public class Test3 {

	public static void main(String[] args) {
		// Invoke print method on different type of 
		//Printers in a single for-each loop
		//Step 1
		//Create array of Printer type of refs referring to different type of Printers
		//dyn. init of array
		Printer[] printers= /*new Printer[] */{new FilePrinter(),
				new ConsolePrinter(),new NetworkPrinter()};
		//How  many objs are created in above statement ?
		//Steps 2 : attach for-each n invoke print

		for(Printer p : printers) 
			p.print("test message !!!!");

	}

}
