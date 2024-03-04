package shapes;

import static java.lang.Math.PI;

public class Rectangle extends BoundedShape {
	private double width;
	private double height;
	
	public Rectangle(int x, int y, double height , double width) {
		super(x,y);
		this.height = height;
		this.width = width;
		
		
		
	}
	//concrete subclass must implement all abstract methods inherited from the abstract super class.
			@Override
			public double area() {
				
				return width*height;
				
				
			}
			//override to String
			@Override
			public String toString() {
				return "Rectangle "+super.toString()+" width : " + width + "height : " + height;
				
			}
		
		

}
