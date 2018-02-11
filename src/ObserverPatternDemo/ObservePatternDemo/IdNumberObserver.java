package ObservePatternDemo;

public class IdNumberObserver implements IObserver {
	private String type = "idNumber";
	
	public IdNumberObserver() {
		
	}
	
	public String type() {
		return type;
	}
	
	public void update(Student student) {
		System.out.println("*** UPDATE! ***");
		System.out.println("Student's ID: " + student.getIdNumber());
	}

}