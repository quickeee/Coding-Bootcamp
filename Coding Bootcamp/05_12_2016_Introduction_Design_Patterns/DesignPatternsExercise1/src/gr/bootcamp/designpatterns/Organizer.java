package gr.bootcamp.designpatterns;

import java.util.Observable;
import java.util.Observer;

public class Organizer implements Observer {

	public void update(Observable o, Object args) {
		System.out.println("I am an organizer and my timeline changed!!");
		Course cs = (Course) o;
		String startTime = cs.getStartTime();
		String endTime = cs.getEndTime();

		System.out.println("My new start time is: " + startTime + ", my new end time is: " + endTime);
	}
}
