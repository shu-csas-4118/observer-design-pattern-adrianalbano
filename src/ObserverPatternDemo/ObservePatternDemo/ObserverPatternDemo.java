package ObservePatternDemo;
import java.util.ArrayList;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Course> courses = new ArrayList<Course>();
		
		Student student = new Student("Adrian", "Albano", 123456, "adrian.albano@student.shu.edu", courses);
		
		Course math = new Course("Calc", 1001, 3, "Dr. Smith");
		Course science = new Course("Bio", 1010, 3, "Mrs. Lane");
		Course history = new Course("US History", 1011, 3, "Mr. John");
		Course language = new Course("Spanish", 1100, 3, "Ms. Cruz");
		
		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		EmailObserver emailObserver = new EmailObserver();
		CourseAdd courseAdd = new CourseAdd();
		CourseDrop courseDrop = new CourseDrop();
		
		student.attachObserver(idObserver);
		student.attachObserver(firstNameObserver);
		student.attachObserver(emailObserver);
		student.attachObserver(courseAdd);
		student.attachObserver(courseDrop);
		
		student.setFirstName("Adrian");
		student.setIdNumber(54321);
		student.setEmail("ajma613@gmail.com");
		
		student.addCourse(math);
		student.addCourse(science);
		student.addCourse(language);
		
		student.setFirstName("James");
		
		student.dropCourse(math);
		student.addCourse(history);
	}

}