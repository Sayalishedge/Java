package p1;

public class ConsolePrinter implements Printer {
// implement inherited abstract method/s
	
	@Override
	public void print(String message) {
		//Can implementation class DIRECTLY(w/o using i/f name.memberName)
		//i/f constants ? YES
		System.out.println("Printing a mesg on the console : " 
		+ message+"  with speed of "+SPEED);
	}
}
