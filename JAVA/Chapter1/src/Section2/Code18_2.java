//call by value. 정렬이 안 되는 이유.

package Section2;

import java.util.Scanner;

public class Code18_2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int [] data = new int[n];

		for(int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}

		bubbleSort(n, data);
		
		for(int i=0; i<n; i++) {
			System.out.print(data[i] + " ");
		}

		kb.close();
	}
	
	static void bubbleSort(int n, int[] data) {
		for(int i=0; i<n-1; i++) { //정렬할 데이터가 하나씩 감소하는 개념이므로 종 n-1번 행하는데, i=n-1; i>0; i-- 로 해도 됨.
			for(int j=0; j<n-1; j++) {
				if(data[j] > data[j+1]) {
//					int tmp;
//					tmp = data[j];
//					data[j] = data[j+1];
//					data[j+1] = tmp;
					swap(data[j], data[j+1]);
				}
			}
		}
	}
	
	static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
	

}
