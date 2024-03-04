package p1;

public class FilePrinter implements Printer {
//either use abstract keyword or implement inherited abstatact method
	
	@Override
	public void print(String message)
	{
		
		System.out.println("sending a message to the File printer: "+message);
		
		
		
	
	}
}
