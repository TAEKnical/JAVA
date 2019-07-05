//입력으로 n*n개의 음이 아닌 한자리 정수가 이차원 배열로 주어진다.(data.txt) 이 정수들 중 가로 세로 대각선의 8방향으로 연속된 숫자들을 이어서 만들 수 있는 모든 소수를 찾아 나열한다. 중복 출력도 관계없음.
package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code21 {
	static int n;
	static int[][] grid;
	
	public static void main(String args[]) {

			Scanner inFile;
			
			try {
				inFile = new Scanner(new File("data.txt"));
				n = inFile.nextInt();
				grid = new int[n][n];
				
				for(int i=0; i<n; i++)
					for(int j=0; j<n; j++)
						grid[i][j] = inFile.nextInt();
				
				inFile.close();
			}
			
			
			catch (FileNotFoundException e) {
				System.out.println("No File");
				System.exit(1);
			}
			
			for(int x=0; x<n; x++) {
				for(int y=0; y<n; y++) {
					for(int dir=0; dir<8; dir++) {
						for(int len=1; len<=n; len++) {
							int val = computeValue(x,y,dir,len);
							if(val != -1 && isPrime(val))
								System.out.println(val);
						}
					}
				}
			}
	}
	
	static int[] offsetX = {0,1,1,1,0,-1,-1,-1};
	static int[] offsetY = {-1,-1,0,1,1,1,0,-1};
	
	static int getDigit(int x, int y, int dir, int i) {
		
		int newX = x+i*offsetX[dir];
		int newY = y+i*offsetY[dir];
		
		if(newX < 0 || newY<0 || newX>=grid.length || newY>=grid.length)
			return -1;
		else
			return grid[newX][newY];
	}
	
	static int computeValue(int x, int y, int dir, int len) {
	
		int value=0;
		for(int i=0; i<len; i++) {
			int digit = getDigit(x,y,dir,i);
			if(digit == -1)
				return -1;
			value = value*10+digit;
		}
		return value;
	}
	
	static boolean isPrime(int val) {
		
		if(val<2)
			return false;
		
		for(int i = 2; i*i<=val; i++) {
			if(val % i == 0)
				return false;
		}
		return true;
	}
	
}
