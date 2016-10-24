import java.math.BigInteger;

public class UsingBigIntegers {

	public static void main(String[] args) {
		// Do not modify these lines of code
		BigInteger b1 = new BigInteger("987654321987654321000000000");
		BigInteger b2 = new BigInteger("987654321987654321000000000");

		BigInteger product = mutliplyBigIntegers(b1, b2);
		BigInteger sum = sumBigIntegers(b1, b2);

		// Check if your results are equal to productResults and sumResult
		BigInteger productResult = new BigInteger("975461059740893157555403139789971041000000000000000000");
		BigInteger sumResult = new BigInteger("1975308643975308642000000000");
		int compare = product.compareTo(productResult);
		if (compare == 0) {
			System.out.println("Yes!");
		} else {
			System.out.println("No");
		}
		int compare1 = sumResult.compareTo(sum);
		if (compare1 == 0) {
			System.out.println("Yes!");
		} else {
			System.out.println("No");
		}
	}

	public static BigInteger sumBigIntegers(BigInteger b1, BigInteger b2) {
		return b1.add(b2);
	}

	public static BigInteger mutliplyBigIntegers(BigInteger b1, BigInteger b2) {
		return b1.multiply(b2);
	}
}