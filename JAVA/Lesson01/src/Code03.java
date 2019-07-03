import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		
		String str = "Hello world";
		String input = null; // 굳이 하지 않아도 자바는 String 타입을 null로 초기화하긴 함
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please type a string: ");
		input = kb.next();// 사용자로부터 첫 공백 이전까지 한 단어만 입력받음. Hello world를 입력해도 Hello만 들어감.
		
		/*if(str == input) { //그래서 str이 Hello world이면 이 프로그램은 절대 str==input을 만족할 수 없음.
		==연산자는 primitive 타입 연산자에 대해서만 사용. String은 primitive 타입이 아님.*/
		
		if(str.equals(input)) { //두 개의 문자열을 비교할 때는 equals 메소드 사용. 
		System.out.println("Strings match! :-)");
		}
		
		else {
			System.out.println("Strings do not match! :-(");
		}
		
		
		kb.close();
				
	}

}
