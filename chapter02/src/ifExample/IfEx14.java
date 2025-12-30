package ifExample;

import java.util.Scanner;

public class IfEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int cash = 20000; // 현재 가지고 있는 현금
		int balance = 30000; // 현재 통장 잔고
		
		int account = 11111; // 계좌번호
		int password = 1234; // 비밀번호
		
		int accountNum = 0; // 현재 입력할 계좌번호 초기값
		int passwordNum = 0; // 현재 입력할 비밀번호 초기값
		
		
		System.out.println("=====MEGA ATM=====");
		System.out.println("1.로그인 2.종료");
		int menu = scan.nextInt();
		
		if(menu == 2) {
			System.out.println("종료");
		}else {
			System.out.println("계좌와 비밀번호를 입력하세요.");
			accountNum = scan.nextInt();
			passwordNum = scan.nextInt();
			if(account != accountNum || password != passwordNum) {
				System.out.println("아이디와 패스워드를 확인해주세요");
			}else {
				System.out.println("1.입금 2.출금 3.조회");
				int menu2 = scan.nextInt();
				if(menu2 == 1) {
					System.out.println("입금할 금액을 입력하세요.");
					int deposit = scan.nextInt();
					if(deposit > cash) {
						System.out.println("더 큰 금액을 입금할 수 없습니다.");
					}else {
						int cashWithdraw = cash - deposit;
						int balanceDeposit = balance + deposit;
						System.out.printf("입금 완료되었습니다. %n현재 통장 잔액 : %d원%n현재 현금 잔액 : %d원",balanceDeposit, cashWithdraw);
					}
				}else if(menu2 == 2) {
					System.out.println("출금할 금액을 입력하세요.");
					int withdraw = scan.nextInt();
					if(withdraw > balance) {
						System.out.println("더 큰 금액을 출금할 수 없습니다.");
					}else {
						int balanceWithdraw = balance - withdraw;
						int cashDeposit = cash + withdraw;
						System.out.printf("입금 완료되었습니다. %n현재 통장 잔액 : %d원%n현재 현금 잔액 : %d원",balanceWithdraw, cashDeposit);
					}
				}else {
					System.out.printf("현재 통장 잔액 : %d원%n현재 현금 잔액 : %d원",balance, cash);
				}
			}
		}
		
		scan.close();
		
		
		
		
	}

}
