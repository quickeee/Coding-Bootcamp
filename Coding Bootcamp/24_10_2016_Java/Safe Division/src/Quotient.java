import java.util.InputMismatchException;
import java.util.Scanner;

public class Quotient {

	int numerator;
	int denominator;
	static Scanner input = new Scanner(System.in);

	public static int calcQuotient(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		boolean success = false;
		while (!success) {
			try {
				System.out.println("Enter the numerator: ");
				int a = input.nextInt();
				System.out.println("Enter the denominator: ");
				int b = input.nextInt();
				int result = calcQuotient(a, b);
				System.out.println(result);
				success = true;
			} catch (InputMismatchException e) {
				System.out.println("the numerator has to be integer!");
				input.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("Division with 0?? Have you even finish the first grade?");
			}
		}
	}
}