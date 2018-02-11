package ObservePatternDemo;

public class Course {
	private String courseName;
	private int courseNumber;
	private int credits;
	private String professor;
	
	public Course(String courseName, int courseNumber, int credits, String professor) {
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.credits = credits;
		this.professor = professor;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getCourseNumber() {
		return this.courseNumber;
	}
	
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	public int getCredits() {
		return this.credits;
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public String getProfessor() {
		return this.professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}

}
