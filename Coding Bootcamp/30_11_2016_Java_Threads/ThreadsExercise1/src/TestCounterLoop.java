
public class TestCounterLoop {

	public static void main(String[] args) {
		Long patient = Long.parseLong(args[0]);
		Integer number = Integer.parseInt(args[1]);
		Thread t = new Thread(new CounterLoop(number));
		long millis = System.currentTimeMillis();
		t.start();

		try {
			t.join(1000);
			if (System.currentTimeMillis() - millis > patient && t.isAlive()) {
				System.out.println(Thread.currentThread().getName()
						+ ": Tired of waiting!!!!! i am the main method and i rule everything!! ho-ho-ho");
				t.interrupt();
				t.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
