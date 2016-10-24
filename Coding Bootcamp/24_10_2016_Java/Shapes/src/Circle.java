
public class Circle extends Shape {

	public int radius;

	public Circle() {
		super(0);
	}

	public Circle(int radius) {
		super(0);
		this.radius = radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return this.radius;
	}

	@Override
	public String toString() {
		return "This circle has radius: " + this.getRadius();
	}

	@Override
	public void area() {
		double area = 3.14 * this.radius * this.radius;
		System.out.println(area);
	}

	@Override
	public void perimeter() {
		double perimeter = 2 * 3.14 * this.radius;
		System.out.println(perimeter);
	}

	@Override
	public void draw() {
		System.out.println("We cannot draw this circle! pitty!");
	}
}
