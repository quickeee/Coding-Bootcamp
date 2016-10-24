
public abstract class Shape {

	protected int number_of_sides;

	public Shape() {

	}

	public Shape(int x) {
		this.number_of_sides = x;
	}

	public int getNumber_of_sides() {
		return this.number_of_sides;
	}

	public void setNumber_of_sides(int x) {
		this.number_of_sides = x;
	}

	public String toString() {
		return "The number of sides of this shape are: " + getNumber_of_sides();
	}

	public abstract void area();

	public abstract void perimeter();

	public abstract void draw();
}
