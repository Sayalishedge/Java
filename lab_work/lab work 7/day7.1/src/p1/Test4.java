package p1;

public class Test4 {

	public static void main(String[] args) {
		// Invoke print method on different type of
		// Printers in a single for-each loop
		// Step 1
		// Create array of Printer type of refs referring to different type of Printers
		// dyn. init of array
		Printer[] printers = /* new Printer[] */ { new FilePrinter(), new ConsolePrinter(), new NetworkPrinter() };
		// How many objs are created in above statement ?
		// Steps 2 : attach for-each n invoke print
		// For a file printer : open file --print --close file

		for (Printer p : printers) {
			if (p instanceof FilePrinter)
				((FilePrinter) p).openFile();
			p.print("test message !!!!");
			if (p instanceof FilePrinter)
				((FilePrinter) p).closeFile();
			System.out.println("------------------------------------");
		}

	}

}
