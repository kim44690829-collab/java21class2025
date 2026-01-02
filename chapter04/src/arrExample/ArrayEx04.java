package arrExample;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87, 11, 45, 98, 23};
		Scanner scan = new Scanner(System.in);
		
		// 학번을 입력받아 성적 출력
		System.out.print("학번 입력 : ");
		int hakbunInput = scan.nextInt();
		for(int i = 0; i < hakbuns.length; i++) {
			if(hakbunInput == hakbuns[i]) {
				System.out.println("성적 : " + scores[i] + "점");
			}
		}
	}

}
