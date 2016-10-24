import java.util.Comparator;

public class TimeComparator implements Comparator<TimeCom> {

	public int compare(TimeCom time1, TimeCom time2) {
		int maxhour = -1, maxminute = -1, maxsecond = -1;
		if (time1.getHour() != time2.getHour()) {
			return time1.getHour() - time2.getHour();
		} else {
			maxhour = 0;
		}
		if (maxhour == 0) {
			if (time1.getMinute() != time2.getMinute()) {
				return time1.getMinute() - time2.getMinute();
			} else {
				maxminute = 0;
			}
		}
		if ((maxhour == 0) && (maxminute == 0)) {
			if (time1.getSecond() != time2.getSecond()) {
				return time1.getSecond() - time2.getSecond();
			} else {
				return 0;
			}
		}
		return 0;
	}
}
