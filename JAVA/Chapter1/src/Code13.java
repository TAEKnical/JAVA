// n���� ���� �ƴ� �� �ڸ� ������ �Է¹޾� �迭�� ������ �� �̵� �߿��� 1�� �̻��� ���ӵ� ���� �̾�ٿ� ���� �� �ִ� �Ҽ� �߿��� ���� ū ��?
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