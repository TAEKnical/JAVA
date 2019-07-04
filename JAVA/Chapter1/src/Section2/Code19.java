package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {

		String[] name = new String[100];
		String[] number = new String[100];
		
		int n = 0;

		try {
			Scanner inFile = new Scanner(new File("input.txt"));

			while(inFile.hasNext()) {//hasNext�� ������ ���������� ������ �ִ°�. ��, ���������ΰ��� true false�� �Ǻ�. false�� ������ ���� ��.
				name[n] = inFile.next(); //������ �о ���ڿ��� �Է�(�������� ����)
				number[n] = inFile.next(); //�� ���� ���ڿ��� �Է�
				n++;
				//ù ���� �׻� �̸�, ��° ���� �׻� ��ȣ�̹Ƿ� ������ ���
				
			}
			
			inFile.close();//���� ��� �������� �ݴ´�

		} catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(1); //status ���� 0�̸� ����, 0�� �ƴϸ� ��������¸� �ǹ�
		}//try �κ��� ���� �����غ��� ������ �߻��ϸ� catch �κ��� �����϶�

		for(int i=0; i<n; i++) {
			System.out.println(name[i] + " : " + number[i]);
		}
	}

}
