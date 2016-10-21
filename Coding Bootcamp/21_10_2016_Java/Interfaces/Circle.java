
public class Circle implements Shape {

	protected double radius;

	@Override
	public double getParameter() {

		return 2 * 3.14 * radius;
	}

	@Override
	public double getArea() {

		return 3.14 * radius * radius;
	}
}
