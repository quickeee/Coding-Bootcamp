
public class TestTimeComparator {

	public static void main(String[] args) {
		TimeCom time1 = new TimeCom(03, 47, 23);
		TimeCom time2 = new TimeCom(05, 52, 28);
		TimeCom time3 = new TimeCom(03, 47, 23);
		TimeComparator test = new TimeComparator();
		System.out.println(test.compare(time1, time2));
		System.out.println(test.compare(time1, time3));
	}
}
