package section3;

public class TestTest {

	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();
		test1.t = 10;
		test1.s = 100;
	
		test1.print1();
		test1.print2();
	
		test2.t = 20;
		test2.s = 200;
	
		test2.print1();
		test2.print2();
		
		test1.print1();
		
	}
}
