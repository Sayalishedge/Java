package p1;

public class NetworkPrinter implements Printer {
//either use abstract keyword or implement inherited abstatact method
	
	@Override
	public void print(String message)
	{
		//can implementation class DIRECTLY(w/o i/f name) i/f constants? YES
		System.out.println("saving a mesage in a text file: "+message);
		
		
		
	
	}
}
