package p1;

public class FilePrinter implements Printer {
	// open file
	public void openFile() {
		System.out.println("opening a file....");
	}
// implement inherited abstract method/s

	@Override
	public void print(String message) {

		System.out.println("Saving a mesg in the text file : " + message);
	}

	// close file
	public void closeFile() {
		System.out.println("closing a file....");
	}
}
