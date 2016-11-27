public class MainClass {

	public static void main(String[] args) throws InterruptedException {

		FibThread fib = new FibThread();
		fib.start();
		// Do not remove this part of code
		System.out.println("The result of the Fibonacci 50 is" + fib.printFib());
		System.exit(1);
	}
}