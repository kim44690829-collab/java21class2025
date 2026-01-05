package multiArrExample;

public class MultiArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
		int result1 = 0;
		int result2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				result1 += arr[i][j];
			}
			System.out.print(result1 + ", ");
			result1 = 0;
		}
		System.out.println();
		for(int i = 0; i < arr[0].length; i++) {
			for(int j = 0; j < arr.length; j++) {
				result2 += arr[j][i];
			}
			System.out.print(result2 + ", ");
			result2 = 0;
		}
		
		
		// System.out.printf("가로 합 : %d, %d, %d%n", result1, result2, result3 );
		// System.out.printf("세로 합 : %d, %d, %d, %d", result4, result5, result6, result7 );
		
	}

}
