import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * This class creates a PriorityQueue with initial capacity 10 and orders the 
 * entries with ascending order.
 */
public class DataStructuresExercise2 {

	// Create an integer comparator.
	static Comparator<Integer> comparator = new IntegerComparator();
	// Create a new PriorityQueue with Integers.
	static Queue<Integer> integerQ = new PriorityQueue<>(50, comparator);

	public static void main(String[] args) {

		// Adding elements to the PriorityQueue.
		integerQ.add(1);
		integerQ.add(9);
		integerQ.add(5);
		integerQ.add(7);
		integerQ.add(4);
		integerQ.add(2);
		integerQ.add(3);
		integerQ.add(8);
		integerQ.add(6);

		// Remove elements from the PriorityQueue and also prints them.
		while (integerQ.size() != 0) {
			System.out.println(integerQ.remove());
		}
	}
}
