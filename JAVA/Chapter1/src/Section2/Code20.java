package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Code20 {
	
	//class members
	static String[] name = new String[100];
	static String[] number = new String[100];
	static int n = 0;
	
	public static void main(String[] args) {
		
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
		
		bubbleSort(); //�̸��� bubblesort�Ͽ� ���
		
		for(int i=0; i<n; i++) {
			System.out.println(name[i] + " : " + number[i]);
		}
	}
	
	static void bubbleSort() {
		for (int i = n-1; i>0; i--) {
			for(int j=0;j<i;j++) {
				if(name[j].compareToIgnoreCase(name[j+1]) > 0 ) {
					String tmp = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp;
					
					tmp = number[j];
					number[j] = number[j+1];
					number[j+1] = tmp;
				}
			}
		}
		
	}
}