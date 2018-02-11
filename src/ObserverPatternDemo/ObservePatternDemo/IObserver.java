package ObservePatternDemo;

public interface IObserver {
	String type();
	void update(Student student);
}
