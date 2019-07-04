// 주어진 배열의 수 중 연속으로 배치된 구간의 합이 가장 큰 경우. 아무것도 선택하지 않는 경우는 0.

import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {

		int n;
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int [] data = new int[n];

		for (int i = 0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		
		int max=0;
		
		for (int i = 0; i<n; i++) {
			int sum = 0;
			for (int j=i; j<n; j++) {
				sum += data[j];
				if (sum > max)
					max = sum;
			}
		}

		System.out.println(max);
		kb.close();
	}

}
// 더 좋은 방법이 있지만 배열 연습용 풀이임