package ifExample;

import java.util.Scanner;

public class IfEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이용할 정거장 수를 입력하세요 : ");
		int choice = scan.nextInt();
		int money = 0;

		if( 0 < choice && choice <= 5) {
			money = 500;
		}else if(5 < choice && choice <= 10) {
			money = 600;
		}else {
			if(choice % 2 == 1) {
				money = 600;
				int moneyAdd = (choice - 10) / 2 * 50;
				money = money + moneyAdd + 50;
			}else if(choice % 2 == 0) {
				money = 600;
				int moneyAdd = (choice - 10) / 2 * 50;
				money = money + moneyAdd;
			}
		}
		
		System.out.println("요금 = " + money + "원");
	}

}
