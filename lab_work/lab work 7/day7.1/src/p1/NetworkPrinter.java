package p1;

public class NetworkPrinter implements Printer {
// implement inherited abstract method/s
	
	@Override
	public void print(String message) {
		
		System.out.println("Sending  a mesg to the server : " 
		+ message);
	}
}
