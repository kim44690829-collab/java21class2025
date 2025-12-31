package ifExample;

import java.util.Random;
import java.util.Scanner;

public class IfEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ra = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ra.nextInt(100) + 150;
		System.out.println("문제 = " + num);
		System.out.print("가운데 숫자를 입력하세요 : ");
		int numInput = scan.nextInt();
	
		int numMin1 = (num % 100)/10;
		
		if(numMin1 == numInput ) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
	}

}
