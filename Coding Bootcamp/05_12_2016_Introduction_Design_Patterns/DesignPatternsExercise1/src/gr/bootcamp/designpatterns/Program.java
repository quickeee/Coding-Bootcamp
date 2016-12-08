package gr.bootcamp.designpatterns;

public class Program {

	public static void main(String[] args) {
		Student student = new Student();
		Instructor instructor = new Instructor();
		Organizer organizer = new Organizer();

		Course course = new Course();
		course.addObserver(student);
		course.addObserver(organizer);
		course.addObserver(instructor);

		course.changeTime("14:00", "15:00");
	}
}