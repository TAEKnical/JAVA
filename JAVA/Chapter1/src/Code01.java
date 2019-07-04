public class Code01 {

	static int num;
	
	public static void main(String[] args) {
		
		int anotherNum = 5;
		num = 2;

		System.out.println(num + anotherNum);
		System.out.println("Num: " + num); //자바에서 + 기호를 사용하여  int형의 2를 문자열롯허 이어붙일 수 있다. 
		System.out.println("AnotherNum: " + anotherNum);
		System.out.println("AnotherNum: " + num + anotherNum); //가장 좌측에 있는 +를 기준으로 동작한다. 가장 좌측이 문자열+숫자이기 때문에 문자열 이어붙이기로서 동작한 것.
	}

}
