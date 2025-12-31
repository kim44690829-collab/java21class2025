package forWhileExample;

import java.util.Scanner;

public class LoopEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int menu1 = 8700;
		int menu2 = 6200;
		int menu3 = 1500;
		
		int menu1Count = 0; 
		int menu2Count = 0; 
		int menu3Count = 0; 
		
		// int count = 0; 
		int price = 0;
		boolean run = true;
		
		System.out.println("=== 롯데리아 ===");
		System.out.printf("1.불고기 버거 : %d원 %n2.새우	버거 : %d원%n3.콜	라 : %d원%n4.입력 종료%n", menu1, menu2, menu3);
		
		while(run == true) {
			System.out.print("메뉴를 선택해주세요 : ");
			int menuChoice = scan.nextInt();
			if(menuChoice == 1) {
				price += menu1;
				menu1Count++;
//				System.out.println(menu1Count);
			}else if(menuChoice == 2){
				price += menu2;
				menu2Count++;
//				System.out.println(menu2Count);
			}else if(menuChoice == 3){
				price += menu3;
				menu3Count++;
//				System.out.println(menu3Count);
			}else if(menuChoice == 4){
				System.out.println("총 금액 = " + price + "원");
				System.out.print("현금을 입력해주세요 : ");
				int money = scan.nextInt();
				int money2 = money - price;
				if(price > money) {
					System.out.println("현금이 부족합니다.");
					price = 0;
					money = 0;
				}else {
					System.out.println("=== 롯데리아 영수증 ===");
					System.out.println("1. 불고기 버거 : " + menu1Count + "개");
					System.out.println("2. 새우	버거 : " + menu2Count + "개");
					System.out.println("3. 콜	라 : " + menu3Count + "개");
					System.out.println("4. 총	금	액 : " + price + "원");
					System.out.println("5. 잔	돈 : " + money2 + "원");
					price = 0;
					money = 0;
				}
			}else if(menuChoice == 8520) {
				run = false;
				System.out.println("프로그램 종료");
			}
			else {
				System.out.println("1번부터 4번까지중에 하나를 선택해주세요.");
			}
			// count++;
			
		}
	}

}
