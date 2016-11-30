import java.util.Vector;

public class ThreadEx implements Runnable {

	private Vector<Long> v = new Vector<>();

	public ThreadEx(Vector<Long> v) {
		this.v = v;
	}

	public void run() {
		try {
			v.addElement(Thread.currentThread().getId());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("I have not finished my job yet");
		}
	}
}
