package section2;

public class DeadlineEvent extends Event{
	
	public MyDate deadline;
	
	public DeadlineEvent(String title, MyDate deadline) {
		super(title);
		this.deadline = deadline;
	}
	
	public String toString() {
		return title + ", " + deadline.toString();
	}
}
