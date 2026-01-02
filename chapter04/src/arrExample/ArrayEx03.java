package arrExample;

import java.util.*; // *로 바꾸면 모든 import 가능

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {87, 11, 45, 98, 23};
		Scanner scan = new Scanner(System.in);
		
		System.out.print("인덱스 입력 : ");
		int indexInput = scan.nextInt();
		System.out.println("성적 : " + arr[indexInput]);
		
		System.out.print("성적 입력 : ");
		int scoreInput = scan.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(scoreInput == arr[i]) {
				System.out.println("인덱스 : " + i);
			}
		}
		
	}

}
