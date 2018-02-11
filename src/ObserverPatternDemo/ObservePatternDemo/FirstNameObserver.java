package ObservePatternDemo;

public class FirstNameObserver implements IObserver {
	private String type = "firstName";
	private Student student;
	
	public FirstNameObserver() {
		
	}
	
	public String type() {
		return type;
	}
	
	public void update(Student student) {
		System.out.println("*** UPDATE! ***");
		System.out.println("Student's first name:  " + student.getFirstName());
	}
}