//12345 �迭�� ��ĭ�� �ڷ� �̷�� �� ó���� �� �������� �ٲ� ��
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

//�������� �϶�ϱ� �ϱ�� �ߴµ� ��� �迭�� ������ �̴� �۾��� ���ص� �ǳ�..;;