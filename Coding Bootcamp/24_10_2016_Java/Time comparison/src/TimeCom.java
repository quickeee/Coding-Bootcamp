
public class TimeCom {

	private int hour, minute, second;

	public TimeCom() {

	}

	public TimeCom(int a, int b, int c) {
		this.setHour(a);
		this.setMinute(b);
		this.setSecond(c);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}

	public void setTime(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}

	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
