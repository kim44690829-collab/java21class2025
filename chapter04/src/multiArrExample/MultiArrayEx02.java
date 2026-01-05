package multiArrExample;

import java.util.Scanner;

public class MultiArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int cnt = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt * 10;
				cnt++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// System.out.println(arr[0][0]);
		
//		System.out.print("인덱스 1 입력(행) : ");
//		int idx1 = scan.nextInt();
//		System.out.print("인덱스 1 입력(열) : ");
//		int idx2 = scan.nextInt();
//		
//		System.out.print("인덱스 2 입력(행) : ");
//		int idx3 = scan.nextInt();
//		System.out.print("인덱스 2 입력(열) : ");
//		int idx4 = scan.nextInt();
//		
//		System.out.println("바꾸기 전 : " + arr[idx1][idx2]);
//		System.out.println("바꾸기 전 : " + arr[idx3][idx4]);
//		
//		int num1 = arr[idx1][idx2];
//		int num2 = arr[idx3][idx4];
//		
//		arr[idx1][idx2] = num2;
//		arr[idx3][idx4] = num1;
//		
//		
//		System.out.println("바꾼 후 : " + arr[idx1][idx2]);
//		System.out.println("바꾼 후 : " + arr[idx3][idx4]);
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// 두 값을 입력받아 그 값들의 위치를 찾아 서로 값 바꾸기
		System.out.print("값 1 입력 : ");
		int num01 = scan.nextInt();
		System.out.print("값 2 입력 : ");
		int num02 = scan.nextInt();
		// 값의 인덱스 위치를 찾을 변수 4개
		int n1Idx01 = 0, n1Idx02 = 0, n2Idx01 = 0, n2Idx02 = 0;
		
		// 값을 교환하기 위해 임시 기억장소인 temp를 지정
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(num01 == arr[i][j]) {
					n1Idx01 = i;
					n1Idx02 = j;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(num02 == arr[i][j]) {
					n2Idx01 = i;
					n2Idx02 = j;
				}
			}
		}
		
		// 찾은 값들을 서로 교환
		temp = arr[n1Idx01][n1Idx02];
		arr[n1Idx01][n1Idx02] = arr[n2Idx01][n2Idx02];
		arr[n2Idx01][n2Idx02] = temp;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//System.out.println("값 출력 : " + arr[idx1][idx2]);
	}

}
