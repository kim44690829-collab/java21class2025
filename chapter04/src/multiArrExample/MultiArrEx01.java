package multiArrExample;

public class MultiArrEx01 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		int result = 0;
		int result2 = 0;
		int sum = 0;
		int cnt = 0;
		// String num4 = "";
		int num4Sum = 0;
		// int count = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				// arr[i][j] = count * 10;
				// count++;
				result = result + 10;
				arr[i][j] = result;
				sum +=  result;
				System.out.print(arr[i][j] + " ");
				if(result % 4 == 0) {
					num4Sum += result;
					cnt++;
				}
			}
			System.out.println();
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				result2 = result2 + 10;
				if(result2 % 4 == 0) {
					System.out.print(result2 + " ");
				}
			}
		}
		System.out.println();
		System.out.println("전체 합 : " + sum);
		System.out.println("4의 배수 개수: " + cnt);
		System.out.println("4의 배수의 합 : " + num4Sum);

	}

}
