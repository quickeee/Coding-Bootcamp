
public class Sum implements Runnable {

	int[] integerArray = new int[1000];
	private int sum = 0;
	private int index = 1;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public synchronized void run() {
		System.out.println(
				"Thread with name: " + Thread.currentThread().getName() + "with index: " + index + " is running...");
		for (int i = (index - 1) * 100; i < index * 100; i++) {
			sum += integerArray[i];
		}
		index++;
		if (index == 11) {
			printSum();
		}
	}

	/*
	 * Prints the sum of the integerArray.
	 */
	public void printSum() {
		System.out.println("");
		System.out.println("The total sum from 1 to 1000 is: " + sum);
	}
}
