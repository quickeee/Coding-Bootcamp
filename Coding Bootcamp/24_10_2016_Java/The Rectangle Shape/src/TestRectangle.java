
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle A = new Rectangle(5, 3);
		Rectangle B = new Rectangle(4, 4);
		Rectangle C = new Rectangle(5, 3);
		Rectangle D = new Rectangle(8, 8);
		A.draw();
		if (B.isSquare()) {
			System.out.println("Yes!");
		}
		if (C.isSquare()) {
			System.out.println("Yes!");
		} else {
			System.out.println("Nop!");
		}
		if (C.areEqual(A)) {
			System.out.println("Yes!");
		}
		if (C.areEqual(B)) {
			System.out.println("Yes");
		} else {
			System.out.println("Nop!");
		}
		B.draw();
	}

}
