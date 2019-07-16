package section3;

public class test {
	public int a;
	public double x;
	
	public boolean equals (Object other) {
		return a == other.a && x == other.x;
	}
	
	public String toString() {
		return a+ " " + x;
	}
	
	public static void main(String [] args) {
		test test = new test();
		System.out.println(test.toString());
	}
}
