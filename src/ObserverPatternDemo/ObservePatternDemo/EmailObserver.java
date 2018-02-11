package ObservePatternDemo;

public class EmailObserver implements IObserver{
	private String type = "email";
	private Student student;
	
	public EmailObserver() {
		
	}
	
	public String type() {
		return type;
	}
	
	public void update(Student student) {
		System.out.println("*** UPDATE! ***");
		System.out.println("Student email: " + student.getEmail());
	}
}
