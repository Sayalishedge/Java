package shapes;
import static java.lang.Math.*;
public class Circle extends BoundedShape {
	
	private double radius;
	public  Circle(int x, int y, double radius){
		super(x,y);
		this.radius = radius;
		
		
	}
		//concrete subclass must implement all abstract methods inherited from the abstract super class.
		@Override
		public double area() {
			
			return PI*radius*radius;
			
		}
		//override to String
		@Override
		public String toString() {
			return "Circle "+super.toString()+" radius " + radius;
		}
	
	
	
	
	
	
}
