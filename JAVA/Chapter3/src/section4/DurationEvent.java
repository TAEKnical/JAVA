package section4;

public class DurationEvent extends Event{
	
	public MyDate begin;
	public MyDate end;
	
	public DurationEvent(String title, MyDate begin, MyDate end) {
		super(title);
		this.begin = begin;
		this.end = end;
	}
	
	public boolean isRelevant(MyDate date) {
		if (begin.compareTo(date) <= 0 && end.compareTo(date) >= 0) //begin < date < end
			return true;
		return false;
	}
	
	public String toString() {
		return title + ", " + begin.toString() + " ~ " + end.toString();
	}
	public MyDate getRepresentativeDate() {
		return begin;
	}
}
