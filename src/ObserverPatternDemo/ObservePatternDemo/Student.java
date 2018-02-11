package ObservePatternDemo;

import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private ArrayList<Course> courses;
	private ArrayList<IObserver> observers;
	
	public Student(String firstName, String lastName, int idNumber, String email, ArrayList<Course> courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.email = email;
		this.courses = courses;
		this.observers = new ArrayList<IObserver>();
	}
	
	public Student() {
		this.observers = new ArrayList<IObserver>();
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		notifyFirstNameObserver();
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
		notifyIdNumberObserver();
	}	
	
	public void setEmail(String email) {
		this.email = email;
		notifyEmailObserver();
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public ArrayList<Course> getCourses(){
		return this.courses;
	}
	
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
		notifyCourseAdd();
	}
	
	public void dropCourse(Course course) {
		courses.remove(course);
		notifyCourseDrop();
	}
	
	public void attachObserver(IObserver observer) {
		this.observers.add(observer);
	}
	
	public void notifyFirstNameObserver() {
		for(IObserver observer: this.observers) {
			if(observer.type().equals("firstName"))
				observer.update(this);
		}
	}
	
	public void notifyIdNumberObserver() {
		for(IObserver observer: this.observers) {
			if(observer.type().equals("idNumber"))
				observer.update(this);
		}
	}
	
	public void notifyEmailObserver() {
		for(IObserver observer: this.observers) {
			if(observer.type().equals("email"))
				observer.update(this);
		}
	}
	
	public void notifyCourseAdd() {
		for(IObserver observer: this.observers) {
			if(observer.type().equals("course add"))
				observer.update(this);
		}
	}
	
	public void notifyCourseDrop() {
		for(IObserver observer: this.observers) {
			if(observer.type().equals("course drop"))
				observer.update(this);
		}
	}
	
	
}