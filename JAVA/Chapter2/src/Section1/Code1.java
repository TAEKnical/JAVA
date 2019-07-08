package Section1;

public class Code1 {
	public static void main(String[] args) {
		
		Person1 first; // 그 클래스 타입의 변수를 선언하고
		first = new Person1(); //new 명령을 사용해서 그 클래스 타입의 객체를 생성한다.
		
		first.name = "John";
		first.number = "01024381032";
		
		System.out.println("Name : " + first.name + ", Number : " + first.number);
		
		Person1[] members = new Person1[100];
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "01012312312";
		
		System.out.println("Name : " + members[1].name + ", Number : " + members[1].number);
		
	}

}
