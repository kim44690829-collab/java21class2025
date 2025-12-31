package ifExample;

import java.util.Random;
import java.util.Scanner;

public class IfEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ran.nextInt(100) + 1;
		
		System.out.println("문제[ " + num + " ]" );
		System.out.print("1. 홀수 \n2. 짝수 \n번호를 선택하세요 : ");
		int choice = scan.nextInt();
		
		int numChk = num % 2; // -> 연산의 경우 변수로 지정 후 계산하는게 효과적
		
		if((numChk == 0 && choice == 2) || (numChk == 1 && choice == 1)) {
			System.out.println("정답!");
		}else {
			System.out.println("오답!");
		} 
	}

}
