// �־��� �迭�� �� �� �������� ��ġ�� ������ ���� ���� ū ���. �ƹ��͵� �������� �ʴ� ���� 0.

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
// �� ���� ����� ������ �迭 ������ Ǯ����