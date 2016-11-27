
public class FibThread extends Thread {

	private long previous = 0;
	private long current = 1;

	public void run() {
		for (int i = 1; i <= 49; i++) {
			current = current + previous;
			previous = current - previous;
		}
	}

	public String printFib() {
		return ": " + current;
	}
}
