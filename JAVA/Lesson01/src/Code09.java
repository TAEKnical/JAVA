//12345 배열을 한칸씩 뒤로 미루고 맨 처음과 맨 마지막은 바꿀 것
import java.util.Scanner;

class Code09 {

	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		
		int [] data = new int[n];
		
		for(int i = 0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		
		for(int i = 0; i<n; i++)
			System.out.print(data[i] + " ");

		kb.close();

		int tmp = data[n-1];
		
		for(int i = n-1; i>0;i--) {
			data[i] = data[i-1];
		}
		System.out.println();
		
		data[0] = tmp;
		
		for(int i = 0; i<n; i++)
			System.out.print(data[i] + " ");
	}

}

//문제에서 하라니까 하기는 했는데 사실 배열을 옆으로 미는 작업은 안해도 되네..;;
