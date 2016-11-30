import java.util.Vector;

public class TestThreadEx {

	public static void main(String[] args) {

		Vector<Long> ve = new Vector<>();

		Thread t1 = new Thread(new ThreadEx(ve));
		Thread t2 = new Thread(new ThreadEx(ve));
		Thread t3 = new Thread(new ThreadEx(ve));

		t1.start();
		t2.start();
		t3.start();

		try {

			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Vector's size is: " + ve.size());
		System.out.println("");
		System.out.println("And the content of the Vector is:");
		System.out.println("");
		for (Long l : ve) {
			System.out.println(l);
		}
	}
}
