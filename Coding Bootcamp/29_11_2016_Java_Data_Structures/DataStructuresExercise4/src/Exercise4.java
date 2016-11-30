import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Exercise4 {

	private static String snippet;
	private static Queue<Character> q = new LinkedBlockingQueue<>();

	public static void main(String[] args) {
		snippet = "for (T t : list1) {" + "if(list2.contains(t)) {" + "list.add(t);" + " }" + "if () {}" + "}";

		for (int i = 0; i < snippet.length(); i++) {
			if (snippet.charAt(i) == ('{') || snippet.charAt(i) == ('}')) {
				q.offer(snippet.charAt(i));
			}
		}
		StringBuilder sb = new StringBuilder();
		for (char i : q) {
			sb.append(q.poll());
		}
		System.out.println(sb.toString());
	}
}
