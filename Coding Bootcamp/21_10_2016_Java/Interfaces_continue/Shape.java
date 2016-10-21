
public class Shape implements Agreeable {

	int width;
	int height;

	Shape() {

	}

	Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int isSmallerThan(Agreeable other) {
		if (((Shape) other).calcArea() > this.calcArea()) {
			return this.calcArea();
		} else {
			return ((Shape) other).calcArea();
		}
	}

	public int calcArea() {
		return this.width * this.height;
	}
}
