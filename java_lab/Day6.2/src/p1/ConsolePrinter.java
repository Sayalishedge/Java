package p1;

public class ConsolePrinter implements Printer {
//either use abstract keyword or implement inherited abstatact method
	
	@Override
	public void print(String message)
	{
		//can implementation class DIRECTLY(w/o i/f name) i/f constants? YES
		System.out.println("printing a mesg on the console printer: "+message
				+"with speed of "+SPEED);
		
		
	
	}
}
