package gr.bootcamp.designpatterns;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {

	public void update(Observable o, Object arg) {
		System.out.println("I am a student and my timeline changed!!");
		Course cs = (Course) o;
		String startTime = cs.getStartTime();
		String endTime = cs.getEndTime();

		System.out.println("My new start time is: " + startTime + ", my new end time is: " + endTime);
	}
}
