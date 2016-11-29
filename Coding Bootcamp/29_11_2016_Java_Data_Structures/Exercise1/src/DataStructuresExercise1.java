import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * A class that has one method that returns the union of two lists
 * and one method that returns the intersection of two lists.
 */
public class DataStructuresExercise1 {

	/*
	 * Returns the union of two Lists.
	 * 
	 * @author Dimitris
	 * 
	 * @param List<T> list1, List<T> list2.
	 */
	public <T> List<T> union(List<T> list1, List<T> list2) {
		Set<T> set = new HashSet<>();
		set.addAll(list1);
		set.addAll(list2);

		return new ArrayList<T>(set);
	}

	/*
	 * Returns the intersection of two Lists.
	 * 
	 * @author Dimitris
	 *
	 * @param List<T> list1, List<T> list2.
	 */
	public <T> List<T> intersection(List<T> list1, List<T> list2) {
		List<T> result = new ArrayList<>();
		for (T element : list1) {
			if (list2.contains(element)) {
				result.add(element);
			}
		}
		return result;
	}
}
