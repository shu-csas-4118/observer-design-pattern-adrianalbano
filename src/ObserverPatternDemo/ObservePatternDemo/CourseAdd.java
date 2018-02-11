package ObservePatternDemo;
import java.util.ArrayList;

public class CourseAdd implements IObserver {
	private String type = "course add";
	private Student student;
	
	public CourseAdd() {
		
	}
	
	public void printCourse(ArrayList<Course> courses) {
		System.out.println("*** COURSE ADDED! ***");
		System.out.println("Registered Courses: ");
		for(Course course: courses)
			System.out.println("Course Name: " + course.getCourseName());
	}
	
	public String type() {
		return type;
	}
	
	public void update(Student student) {
		printCourse(student.getCourses());
	}

}
