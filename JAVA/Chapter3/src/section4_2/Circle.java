package section4_2;

public class Circle extends Shape{
	public int radius;
	
	public Circle(int r) {
		super("Circle");
		radius = r;
	}
	
	public double computerArea() {
		return (double)Math.PI * radius * radius;
	}
	
	public double computerPerimeter() {
		return (double)Math.PI * 2 * radius;
	}
	
	public String toString() {
		return "Circle : radius is " + radius;
	}
	

}
