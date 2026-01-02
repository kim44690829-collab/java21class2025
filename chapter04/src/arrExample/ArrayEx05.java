package arrExample;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87, 11, 45, 98, 23};
		Scanner scan = new Scanner(System.in);
		boolean check = true;
		// int chk = -1;
		
		System.out.print("학번 입력 : ");
		int hakbunInput = scan.nextInt();
		
		for(int i = 0; i < hakbuns.length; i++) {
			if(hakbunInput == hakbuns[i]) {
				System.out.println("성적 : " + scores[i] + "점");
				check = false;
				// chk = hakbuns[i]
			}
		}
		if(check) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		// if(chk != -1){
			// System.out.println(hakbuns[chk] + "의 성적 : " + scores[chk] + "점");
		// }else{
			// System.out.println("존재하지 않는 학번입니다.");
		//}
	}

}
