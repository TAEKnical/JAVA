//1에서 10만사이의 숫자를 소수인지 아닌지 판단하기
public class Code10 {

	public static void main(String[] args) {

		//int n = 10111;
		// 2에서 n-1까지 나눠보는게 정석
		// 조금 더 생각해보면 n/2까지만 나눠보면 됨. n의 약수가 n/2보다 클 수는 없기 떄문에.
		// 또 생각해보면 n/2까지 갈 필요도 없음. sqrt(n)까지만 가면 됨.
		// n의 약수 중에 sqrt(n)보다 큰게 있다면 반드시 sqrt(n)보다 작은 약수도 존재해야 하기 때문에.
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
