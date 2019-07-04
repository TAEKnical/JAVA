// n개의 음이 아닌 한 자리 정수를 입력받아 배열에 저장한 후 이들 중에서 1개 이상의 연속된 수를 이어붙여 얻을 수 있는 소수 중에서 가장 큰 값?
import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		int n;
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();

		int [] data = new int[n];
		for(int i=0;i<n;i++) {
			data[i] = kb.nextInt();
		}

		int max = 0;

		for(int i=0; i<n; i++) {

			int value = 0;
			boolean isPrime = true;

			for(int j=i; j<n; j++) {
				value = value*10 + data[j];
				
				for(int k=2; k*k <= value; k++) {
					if(value % k == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime && value > max && value > 1)
					max = value;
			}
		}

		if (max > 0)
			System.out.println(max);
		else
			System.out.println("No prime is there");
		
		kb.close();

	}

}
