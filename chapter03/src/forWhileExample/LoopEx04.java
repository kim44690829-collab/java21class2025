package forWhileExample;

import java.util.Scanner;

public class LoopEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		int num = 0;
		// boolean run = true;
		// while(조건) -> true는 무한루프 
		while(true){ // while(run == true)
			System.out.print("숫자를 입력하세요(100 입력시 종료) : ");
			int num = scan.nextInt();
			if(num == -100) {
				System.out.println("종료됩니다.");
				break; // run = false; -> break를 쓰지 않는 종료
			}
		}
//		while(num != -100){ 
//			System.out.print("숫자를 입력하세요(100 입력시 종료) : ");
//			num = scan.nextInt();
//			if(num == -100) {
//				System.out.print("종료합니다");
//			}
//		}
	}
}
