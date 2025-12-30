package ifExample;

import java.util.Scanner;

public class IfEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700, price2 = 6700, price3 = 1800;
		System.out.println("===롯데리아===");
		System.out.printf("1.불고기 버거 : %d원%n2.새우 버거 : %d원%n3.콜라 : %d원%n", price1, price2, price3);
		
		System.out.println();
		
		System.out.print("메뉴를 선택하세요 : ");
		int menu = scan.nextInt();
		
		System.out.print("현금을 입력하세요 : ");
		int money = scan.nextInt();
		
		int charge = 0; // 잔돈
		
		if(menu == 1) {charge = money - price1;}
		if(menu == 2) {charge = money - price2;}
		if(menu == 3) {charge = money - price3;}
		
		if(charge >= 0) {
			System.out.printf("계산 완료되었습니다. %n현재 잔돈 : %d원", charge);
		}else {
			System.out.printf("현금이 부족합니다. %n현재 잔돈 : %d", charge);
		}
		
//		switch(menu) {
//		case 1:
//			if(money < 8700) {
//				System.out.printf("현금이 부족합니다. %n현재 잔돈 : %d", money);
//			}else {
//				System.out.printf("계산 완료되었습니다. %n현재 잔돈 : %d원", (money - 8700));
//			}
//			break;
//		case 2:
//			if(money < 6200) {
//				System.out.printf("현금이 부족합니다. %n현재 잔돈 : %d", money);
//			}else {
//				System.out.printf("계산 완료되었습니다. %n현재 잔돈 : %d원", (money - 6200));
//			}
//			break;
//		default:
//			if(money < 1500) {
//				System.out.printf("현금이 부족합니다. %n현재 잔돈 : %d", money);
//			}else{
//				System.out.printf("계산 완료되었습니다. %n현재 잔돈 : %d원", (money - 1500));
//			}
//		}
		
	}

}
