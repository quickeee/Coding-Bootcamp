public class Counter implements Runnable {
	private int c = 0;

	public void increment() {
		c++;
	}

	public void decrement() {
		c--;
	}

	public int value() {
		return c;
	}

	public void run() {
		increment();
		System.out.println("I am thread" + Thread.currentThread().getName() + "and the c value is " + value());
		decrement();
	}
}

/*
 * If we remove the synchronized from all the methods of this class then the
 * result of the output is a chaotic situation.
 * The method execution order is random for each thread.
 */
