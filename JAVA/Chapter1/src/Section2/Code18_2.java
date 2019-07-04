//call by value. ������ �� �Ǵ� ����.

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
		for(int i=0; i<n-1; i++) { //������ �����Ͱ� �ϳ��� �����ϴ� �����̹Ƿ� �� n-1�� ���ϴµ�, i=n-1; i>0; i-- �� �ص� ��.
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