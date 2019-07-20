package section3;

public class test {
	
	public static void main(String [] args) {
		Object [] array = new Object[100];
		int a = 20;
		array[0] = a;
		
		int b = (Integer)array[0];
		System.out.println(b);
		
		String str = "1234";
		int c = Integer.parseInt(str);
		System.out.println(c);
	}
}
