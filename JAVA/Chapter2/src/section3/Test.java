package section3;
public class Test {
	public static int s = 0;
	public int t = 0;

	public static void print1() {
		System.out.println("s = " + s);
	}

	public void print2() {
		System.out.println("t = " + t);
	}
	
	public static void main(String [] args) {
		s=100;
		Test a = new Test();
		a.t=100;
		print1();
		a.print2();
	}
}