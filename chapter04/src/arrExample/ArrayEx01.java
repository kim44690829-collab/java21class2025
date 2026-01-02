package arrExample;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 10부터 50까지 arr 배열에 저장
		
		int[] arr = {10, 20, 30, 40, 50};
		System.out.println("arr 배열에 저장된 요소 : " + Arrays.toString(arr));
		System.out.println();
		
		int sum = 0;
		int count = 0; // 4의 배수의 개수
		int count2 = 0; // 짝수의 개수
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				// 4의 배수만 출력
				System.out.println("4의 배수 : " + arr[i]);
			}
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				// 4의 배우의 합 출력
				sum += arr[i];
			}
		}
		System.out.println("4의 배수의 합 : " + sum);
		System.out.println();
		
		// 4의 배수의 개수 출력
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				count++;
			}
		}
		System.out.println("4의 배수의 개수 : " + count);
		System.out.println();
		
		// 짝수의 개수 출력
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count2++;
			}
		}
		System.out.println("짝수의 개수 : " + count2);

	}

}
