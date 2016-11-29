import java.util.HashMap;

public class DataStructuresExercise3<E> {

	/*
	 * Returns the intersection of the values of two HashMaps in a new HashMap.
	 */
	public <T> HashMap<Integer, E> intersection(HashMap<T, E> hm1, HashMap<T, E> hm2) {
		HashMap<Integer, E> newHm = new HashMap<>();
		Integer counter = 0;
		for (E o : hm1.values()) {
			for (E i : hm2.values()) {
				if (i.equals(o)) {
					newHm.put(++counter, i);
				}
			}
		}
		return newHm;
	}
}
