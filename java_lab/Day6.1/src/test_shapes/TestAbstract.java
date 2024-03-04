package test_shapes;
import shapes.*;

public class TestAbstract {
	public static void main(String[] args) {
		//Create array of references to hold Circle and rectangle object reference.
		//dynamic initialisation of array
		//for primitive types
		
		double[] data =  {10.5,1,3,4,5.7,12.4};
//		double[] data = new double[] {10.5,1,3,4,5,6.76,7}; done by default

		//dynamic initialisation of array of references
		BoundedShape[] shapes = /* new BoundedShape[] */ { new Circle(10 ,20 ,10.5),
						 new Rectangle(50,10,12.5,10.8)};
		
		//System.out.println(shapes.getClass());
		for(BoundedShape s : shapes) {
			System.out.println(s);
			System.out.println("Area " +s.area());
			System.out.println();
		}
			
		
	}
}
