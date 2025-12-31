package ifExample;

import java.util.Random;

public class IfEx17 {
	public static void main(String[] args) {
		Random ra = new Random();
		
		int num = ra.nextInt(50) + 1;
		
		System.out.println("문제  = " + num);
		// 나머지 == 0 -> 일단 3의 배수
		// 그 중에 3,6,9,가 들어가야함
		// 
		int num1 = num / 10;
		int num2 = num % 10;
		// 개수
		int count = 0;
		if(num1 == 3 || num1 == 6 || num1 == 9) {
			count++;
		}
		if(num2 == 3 || num2 == 6 || num2 == 9) {
			count++;
		}
		
		if(count == 2) {
			System.out.println("짝짝");
		}else if(count == 1) {
			System.out.println("짝");
		}else {
			System.out.println(num);
		}
	}
}
