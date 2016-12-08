package gr.bootcamp.designpatterns;

import java.util.Observable;

public class Course extends Observable {

	private String startTime;

	private String endTime;

	public Course() {
	}

	public Course(String startTime, String endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public void changeTime(String startTime, String endTime) {
		setStartTime(startTime);
		setEndTime(endTime);
		setChanged();
		notifyObservers();
	}
}
