package section1;

public class Code1_2 {
	public static void main(String[] args) {
		
		Person1 first; // 그 클래스 타입의 변수를 선언하고
		first = new Person1(); //new 명령을 사용해서 그 클래스 타입의 객체를 생성한다.
		
		first.name = "John";
		first.number = "01024381032";
		
		System.out.println("Name : " + first.name + ", Number : " + first.number);
		
		Person1 second = new Person1();
		second = first;
		second.name = "Tom";
		
		System.out.println("Name : " + second.name + ", Number : " + second.number);
		
		Person1[] members = new Person1[100];
		members[0] = first;
		members[1] = second;
		System.out.println("Name : " + members[0].name + ", Number : " + members[0].number);
		System.out.println("Name : " + members[1].name + ", Number : " + members[1].number);
		
		members[2] = new Person1();
		members[2].name = "David";
		members[2].number = "01020123712";
		
		System.out.println("Name : " + members[2].name + ", Number : " + members[2].number);
		
	}

}
