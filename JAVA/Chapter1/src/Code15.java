import java.util.Scanner;

//사용자로부터 n개의 정수를 입력받고 정수가 하나씩 입력될 때 마다 현재까지 입력된 정수를 오름차순으로 정렬하여 보여준다.
//ordered list insert
public class Code15 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int [] data = new int[n];

		for(int i=0; i<n; i++) {
			int tmp = kb.nextInt();

			int j = i-1;
			while(j>=0 && data[j] > tmp) {
				data[j+1] = data[j];
				j--;
			}

			data[j+1] = tmp;

			for (int k=0; k<i+1; k++)
				System.out.print(data[k] + " ");
			System.out.println();
		}

	}

}
