
public class CounterLoop implements Runnable {

	private int number;

	public CounterLoop(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}

	public void run() {
		try {
			for (int i = 1; i <= number; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + ": (yelling) I have not finished my job yeeeeeet");
		}
	}
}
