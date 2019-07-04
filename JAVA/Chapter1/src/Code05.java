
public class Code05 {

	public static void main(String[] args) {
	
		int [] grades; // int형 배열 greades를 만들겠다는 의사만 밝힌 상태.
		grades = new int[5]; // 실제 배열이 생성되는 시점은 여기.
		//위 두 줄은 한 라인으로 작성할  수 있다.
		// int[] grades = new int[5];
		
		
		/*
		 double [] array1;
		 array1 = new double[5];
		 
		 -> double[] array1 = new double[5];
		 
		 string [] array2;
		 array2 = new string[10];
		 
		 -> string[] array2 = new string[10];
		 */
		
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades[4]);
		
		
		
		
	}

}
