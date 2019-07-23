package section4;

public abstract class Event implements Comparable {
	public String title;
	public Event(String title) {
		this.title = title;
	}
	
	public abstract boolean isRelevant(MyDate date);
	public abstract MyDate getRepresentativeDate();
	public int compareTo(Object other) {
		MyDate mydate = getRepresentativeDate();
		MyDate yours = ((Event)other).getRepresentativeDate();
		return mydate.compareTo(yours);
	}
	
}
