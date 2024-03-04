package p2;

/*
 * A class can imple multiple i/fs .
 * IN order to create a concrete class ,
 *  it MUST imple all of the inherited abstract methods
 */
public class C implements A, B {

	@Override
	public boolean isEven(int no) {
		// TODO Auto-generated method stub
		return no % 2 == 0;
	}

	@Override
	public void show() {
		System.out.println("in show");

	}

	@Override
	public double add(double d1, double d2) {
		// TODO Auto-generated method stub
		return d1 + d2;
	}

}
