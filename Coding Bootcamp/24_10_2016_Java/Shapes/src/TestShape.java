import java.util.ArrayList;

public class TestShape {

	static ArrayList<Shape> shapes = new ArrayList<>();

	public static void main(String[] args) {
		Shape A = new Rectangle(2, 3);
		Shape B = new Rectangle(3, 5);
		A.area();
		B.perimeter();
		// For the methods areEquals, copy and isSquare we observer that we
		// cannot use them
		// because the superclass Shape does not contain them, so we cannot
		// override them in the class Rectangle!
		Shape circle1 = new Circle(5);
		Shape circle2 = new Circle(7);
		shapes.add(A);
		shapes.add(B);
		shapes.add(circle1);
		shapes.add(circle2);
		for (int i = 0; i < shapes.size(); i++) {
			System.out.println(shapes.get(i));
		}
	}
}
