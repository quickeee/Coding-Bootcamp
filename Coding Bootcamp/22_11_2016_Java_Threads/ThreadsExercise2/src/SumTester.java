import java.util.ArrayList;
import java.util.List;

public class SumTester {

	public static void main(String[] args) {
		Sum sum = new Sum();
		List<Thread> listOfThreads = new ArrayList<>(10);
		for (int k = 0; k < 1000; k++) {
			sum.integerArray[k] = k + 1;
		}
		for (int i = 0; i < 10; i++) {
			listOfThreads.add(new Thread(sum));
			listOfThreads.get(i).start();
		}
	}
}
