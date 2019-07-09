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
				System.out.println("꼭지점의 개수로 0은 입력할 수 없습니다.");
				System.exit(1);
			}
			OrthoPolygon thePolygon = new OrthoPolygon(n);
			for(int i=0; i<n; i++)
				thePolygon.addVertex(inFile.nextInt(), inFile.nextInt()); //꼭지점의 좌표를 시계방향 순서로 입력받아 다각형에 추가한다.
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
