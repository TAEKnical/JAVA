import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		
		String str = "Hello world";
		String input = null; // ���� ���� �ʾƵ� �ڹٴ� String Ÿ���� null�� �ʱ�ȭ�ϱ� ��
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please type a string: ");
		input = kb.next();// ����ڷκ��� ù ���� �������� �� �ܾ �Է¹���. Hello world�� �Է��ص� Hello�� ��.
		
		/*if(str == input) { //�׷��� str�� Hello world�̸� �� ���α׷��� ���� str==input�� ������ �� ����.
		==�����ڴ� primitive Ÿ�� �����ڿ� ���ؼ��� ���. String�� primitive Ÿ���� �ƴ�.*/
		
		if(str.equals(input)) { //�� ���� ���ڿ��� ���� ���� equals �޼ҵ� ���. 
		System.out.println("Strings match! :-)");
		}
		
		else {
			System.out.println("Strings do not match! :-(");
		}
		
		
		kb.close();
				
	}

}
