package section2;

import java.util.Scanner;

public class Scheduler {
	private int capacity = 10;
	Event [] events = new Event [capacity]; //super 클래스 타입의 변수는 subclass 타입의 객체를 참조할 수 있다는 다형성을 이용. 
	public int n = 0;
	private Scanner kb = new Scanner(System.in);
	 
	public static void main(String [] args) {
		Scheduler app = new Scheduler();
		app.processCommand(); 
	}

	public void processCommand() {
		
		while(true) {
			System.out.print("$ ");
			String command = kb.next();
			if(command.equals("addevent")) {
				String type = kb.next();
				if(type.equalsIgnoreCase("oneday")) {
					handleAddOneDayEvent();
				}
				else if(type.equalsIgnoreCase("duration")) {
					handleAddDurationEvent();
				}
				else if(type.equalsIgnoreCase("deadline")) {
					handleAddDeadlinedEvent();
				}
			}
			else if(command.equals("list")) {
				handleList();
			}
			else if(command.equals("show")) {

			}
			else if(command.equals("exit")) {
				break;
				
			}
		}
		kb.close();
	}

	private void handleList() {
		for(int i = 0; i<n; i++)
			System.out.println("	" + events[i].toString());		
	}

	private void handleAddOneDayEvent() {
		System.out.print("	When: "); //2017/1/20
		String dateString = kb.next();
		System.out.print("	Title: ");
		String title = kb.next();
		
		MyDate date = parseDateString(dateString);
	
		
		OneDayEvent ev = new OneDayEvent(title,date);
		addevent(ev);
	}
	private void handleAddDurationEvent() {
		System.out.print("	Begin: "); //2017/1/20
		String dateString = kb.next();
		System.out.print("	End: "); //2017/1/20
		String dateString2 = kb.next();
		System.out.print("	Title: ");
		String title = kb.next();
		
		MyDate begindate = parseDateString(dateString);
		MyDate enddate = parseDateString(dateString);
	
		DurationEvent ev = new DurationEvent(title,begindate,enddate);
		addevent(ev);
	}	
	
	private void handleAddDeadlinedEvent() {
		System.out.print("	Until: "); //2017/1/20
		String dateString = kb.next();
		System.out.print("	Title: ");
		String title = kb.next();
		
		MyDate deadlinedate = parseDateString(dateString);
	
		DeadlineEvent ev = new DeadlineEvent(title,deadlinedate);
		addevent(ev);
	}

	private void addevent(Event ev) {
		if(n>=capacity) {
			reallocate();
		}
		events[n] = ev;
		n++;	
	}

	private void reallocate() {
		Event [] tmp = new Event [capacity * 2];
		for (int i=0; i<n; i++)
			tmp[i] = events[i];
		events = tmp;
		capacity *=2;
	}

	private MyDate parseDateString(String dateString) {
		String[] tokens = dateString.split("/");
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		
		MyDate d = new MyDate(year,month,day);
		return d;
	}
  



}
