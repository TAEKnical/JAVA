import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		int number = 123;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		
		int input = keyboard.nextInt(); //키보드로부터 하나의 정수를 입력받는 nextInt 메소드.
		
		if(input == number) {
			System.out.println("Numbers match! :-)");
		}
		else{
			System.out.println("Numbers do not match! :-(");
		}
		
		keyboard.close(); // 클래스를 사용했으면 닫아야 함.
	}

}
