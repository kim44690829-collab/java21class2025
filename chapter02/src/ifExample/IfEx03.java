package ifExample;

import java.util.Scanner;

public class IfEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성적을 입력하세요(0 ~ 100) : ");
		int score = scan.nextInt();
		if(60 <= score && score <= 100) {
			System.out.println("합격");
		}else if(0 <= score && score < 60) {
			System.out.println("불합격");
		}else {
			System.out.println("성적을 잘못 입력했습니다.");
		}
	}

}
