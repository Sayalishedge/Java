package tester;

public class Test1 {

	public static void main(String[] args) {
		try {
			int[] data = { 10, 20, 30, 40 };
			System.out.println(data[0]);
			System.out.println("Parsed int value" + Integer.parseInt("1234"));
			int a = 10;
			int b = 0;
			System.out.println("div " + (a / b));
			String s = null;
			System.out.println("1st char " + s.charAt(0));
			System.out.println("end of try....");
		}
//		 catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(1);
//		} catch (NumberFormatException | ArithmeticException e) {
//			System.out.println(2);
//		} 
		catch (Exception e) {
			System.out.println("in catch-all");
			System.out.println("Message " + e.getMessage());
			System.out.println("toString " + e);
			System.out.println("Stack trace ");
			e.printStackTrace();
		}
		System.out.println("main continues.....");
	}

}
