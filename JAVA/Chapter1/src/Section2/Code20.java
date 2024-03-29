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

			while(inFile.hasNext()) {//hasNext는 파일이 다음라인을 가지고 있는가. 즉, 마지막줄인가를 true false로 판별. false면 마지막 줄인 것.
				name[n] = inFile.next(); //파일을 읽어서 문자열을 입력(공백으로 구분)
				number[n] = inFile.next(); //그 다음 문자열을 입력
				n++;
				//첫 열은 항상 이름, 둘째 열은 항상 번호이므로 가능한 방식
			}
	
			inFile.close();//파일 사용 끝났으면 닫는다

		} catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(1); //status 값이 0이면 정상, 0이 아니면 비정상상태를 의미
		}//try 부분을 먼저 실행해보고 문제가 발생하면 catch 부분을 실행하라
		
		bubbleSort(); //이름을 bubblesort하여 출력
		
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
