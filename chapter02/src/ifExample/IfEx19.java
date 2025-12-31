package ifExample;

import java.util.Random;
import java.util.Scanner;

public class IfEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ra = new Random();
		
		int num1 = ra.nextInt(10) + 1;
		int num2 = ra.nextInt(10) + 1;
		int num3 = ra.nextInt(4) + 1;
		int result = 0;
		
		if(num3 == 1) {
			result = num1 + num2;
		}else if(num3 == 2) {
			result = num1 - num2;
		}else if(num3 == 3) {
			result = num1 * num2;
		}else {
			result = num1 % num2;
		}
		
		System.out.println(num1 + " ? " + num2 + " = " + result);
		System.out.println("1) + 2) - 3) * 4) %");
		System.out.print("번호를 선택하세요 : ");
		int answer = scan.nextInt();
		if(answer == num3) {
			System.out.println("정답");
		}else if(answer != num3){
			System.out.println("다시 한번 선택하세요");
			answer = scan.nextInt();
			if(answer == num3) {
				System.out.println("정답");
			}else {
				System.out.println("오답");
			}
		}else {
			System.out.println("오답");
		}
	}

}
