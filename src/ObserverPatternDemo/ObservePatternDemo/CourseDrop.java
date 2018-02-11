package ObservePatternDemo;
import java.util.ArrayList;

public class CourseDrop implements IObserver{
	private String type = "course drop";
	private String student;
	
	public CourseDrop() {
		
	}
	
	public String type() {
		return type;
	}
	
	public void printCourse(ArrayList<Course> courses) {
		System.out.println("*** COURSE DROPPED! ***");
		System.out.println("Registered courses:");
		for (Course course: courses)
			System.out.println("Courses: " + course.getCourseName());
	}
	
	public void update(Student student) {
		printCourse(student.getCourses());
	}
}
