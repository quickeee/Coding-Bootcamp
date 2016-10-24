
public class Rectangle {

	int a;
	int b;

	public Rectangle() {

	}

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return this.a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getB() {
		return this.b;
	}

	public String toString() {
		return "The side a of this rectangle is: " + getA() + " and the side b of this rectangle is: " + getB();
	}

	public boolean areEqual(Rectangle X) {
		if (this.a == X.getA() && this.b == X.getB()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isSquare() {
		if (this.a == this.b) {
			return true;
		} else {
			return false;
		}
	}

	public void draw() {
		for (int j = 1; j <= this.getB(); j++) {
			for (int i = 1; i <= this.getA(); i++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public Rectangle copy(Rectangle X) {
		return new Rectangle(X.getA(), X.getB());
	}
}
