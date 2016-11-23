import java.util.Arrays;

/*
 * Swapper class that swaps the first element of an array with the last, the second with the semilast, etc.
 * 
 * @author Dimitris
 */

public class Swapper {
	// An array with 9 Integer elements.
	private static Integer[] integerArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, }; // I
																			// used
																			// an
																			// odd
																			// number
																			// as
																			// length
																			// of
																			// my
																			// array
	// just to show that the
	// swapElements method works fine with both even and odd number of objects
	// of an array.
	
	// An array with 10 Double elements.
	private static Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1 };

	public static <T> void swapElements(T[] elements) {
		for (int i = 0; i < elements.length / 2; i++) {
			T tempElement;
			tempElement = elements[i];
			elements[i] = elements[elements.length - 1 - i];
			elements[elements.length - 1 - i] = tempElement;
		}
		System.out.println(Arrays.toString(elements));
	}

	public static void main(String[] args) {
		swapElements(integerArray);
		swapElements(doubleArray);
	}
}