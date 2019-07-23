package section4;

public class DeadlineEvent extends Event{
	
	public MyDate deadline;
	
	public DeadlineEvent(String title, MyDate deadline) {
		super(title);
		this.deadline = deadline;
	}
	
	public boolean isRelevant(MyDate date) {
		if (deadline.compareTo(date) > 0) //begin < date < end
			return true;
		return false;
	}
	
	public String toString() {
		return title + ", " + deadline.toString();
	}
	public MyDate getRepresentativeDate() {
		return deadline;	}
}
