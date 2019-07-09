package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code10 {
	
	public static void main(String[] args) {
		Scanner inFile;
		try {
			inFile = new Scanner(new File("data.txt"));
			int n = inFile.nextInt();
			if(n==0) {
				System.out.println("�������� ������ 0�� �Է��� �� �����ϴ�.");
				System.exit(1);
			}
			OrthoPolygon thePolygon = new OrthoPolygon(n);
			for(int i=0; i<n; i++)
				thePolygon.addVertex(inFile.nextInt(), inFile.nextInt()); //�������� ��ǥ�� �ð���� ������ �Է¹޾� �ٰ����� �߰��Ѵ�.
			MyPoint2 thePoint = new MyPoint2(inFile.nextInt(), inFile.nextInt());
			inFile.close();
			
			if(thePolygon.isContains(thePoint))
				System.out.println("Yes");
			else
				System.out.println("No");
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists");
			System.exit(1);
		}

		
	}

}
