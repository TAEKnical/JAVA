//1���� 10�������� ���ڸ� �Ҽ����� �ƴ��� �Ǵ��ϱ�
public class Code10 {

	public static void main(String[] args) {

		//int n = 10111;
		// 2���� n-1���� �������°� ����
		// ���� �� �����غ��� n/2������ �������� ��. n�� ����� n/2���� Ŭ ���� ���� ������.
		// �� �����غ��� n/2���� �� �ʿ䵵 ����. sqrt(n)������ ���� ��.
		// n�� ��� �߿� sqrt(n)���� ū�� �ִٸ� �ݵ�� sqrt(n)���� ���� ����� �����ؾ� �ϱ� ������.
		for( int n = 2; n<=100000;n++) {
			boolean isPrime = true;

			for (int i=2; i*i <= n && isPrime; i++) {
				if (n % i ==  0) {
					//not prime
					isPrime = false;
				}
			}

			if (isPrime)
				System.out.println(n);
		}

	}

}
