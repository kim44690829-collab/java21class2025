package forWhileExample;

import java.util.Scanner;

public class LoopEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int acc = 0;
		int pw = 0;
		
		int acc1Total = 0;
		int acc2Total = 0;
		
		boolean login = false; // 로그인 상태
		boolean run = true; // while문 실행
		
		int loginMenu = 0;
		int selectMenu = 0;
		
		int deposit = 0; // 입금할 금액
		int depositAcc = 0; // 입금할 금액
		int withdraw = 0; // 출금할 금액
		int withdrawAcc = 0; // 출금할 금액
		
		int depositMoney = 0; // 이체할 금액
		int withdrawMoney = 0; // 이체로 인해 출금할 금액
		
		int charge1 = dbMoney1 - withdraw;
		int charge2 = dbMoney2 - withdraw;
		
		
		
		while(run == true) {
			System.out.println("1.로그인 \n2.로그아웃\n3.종료\n");
			System.out.print("메뉴 선택 : ");
			loginMenu = scan.nextInt();
			if(loginMenu == 1) { // 로그인 버튼 클릭
				if(login == true) {
					System.out.println("이미 로그인 상태입니다.");
				}else {
					System.out.print("계좌번호 입력 : ");
					acc = scan.nextInt();
					System.out.print("비밀번호 입력 : ");
					pw = scan.nextInt();
					if((acc == dbAcc1 && pw == dbPw1) || (acc == dbAcc2 && pw == dbPw2)) {
						System.out.println(acc + "님 환영합니다.");
						System.out.println("1.입금 \n2.출금\n3.이체\n4.조회");
						System.out.print("메뉴 선택 : ");
						selectMenu = scan.nextInt();
						if(selectMenu == 1) {
							System.out.print("입금할 금액 입력 : ");
							deposit = scan.nextInt();
							if(acc == dbAcc1) {
								dbMoney1 += deposit;
								System.out.println(acc + "님의 계좌 잔액 : " + dbMoney1);
							}else {
								dbMoney2 += deposit;
								System.out.println(acc + "님의 계좌 잔액 : " + dbMoney2);
							}
						}else if(selectMenu == 2) {
							System.out.print("출금할 금액 입력 : ");
							withdraw = scan.nextInt();
							if(acc == dbAcc1) {
								if(charge1 < 0) {
									System.out.print("출금할 금액이 부족합니다.");
								}else {
									dbMoney1 -= withdraw;
									System.out.println(acc + "님의 계좌 잔액 : " + dbMoney1);
								}
							}else {
								if(charge2 < 0) {
									System.out.print("출금할 금액이 부족합니다.");
								}else {
									dbMoney2 -= withdraw;
									System.out.println(acc + "님의 계좌 잔액 : " + dbMoney2);
								}
							}
						}else if(selectMenu == 3) {
							if(acc == dbAcc1) {
								System.out.print("입금할 계좌를 입력해주세요 : ");
								depositAcc = scan.nextInt();
								System.out.print("이체할 금액을 입력해주세요 : ");
								depositMoney = scan.nextInt();
								
								acc1Total = dbMoney1 - depositMoney;
								acc2Total = dbMoney2 + depositMoney;
								
								if(acc1Total < 0) {
									System.out.print("계좌의 잔액이 부족합니다.");
								}else {
									System.out.print("이체를 완료했습니다.");
									System.out.println(dbAcc1 + "님의 계좌 잔액 : " + acc1Total);
									System.out.println(dbAcc2 + "님의 계좌 잔액 : " + acc2Total);
								}
							}else {
								System.out.print("입금할 계좌를 입력해주세요 : ");
								depositAcc = scan.nextInt();
								System.out.print("이체할 금액을 입력해주세요 : ");
								depositMoney = scan.nextInt();
								
								acc2Total = dbMoney2 - depositMoney;
								acc1Total = dbMoney1 + depositMoney;
								
								if(acc2Total < 0) {
									System.out.print("계좌의 잔액이 부족합니다.");
								}else {
									System.out.print("이체를 완료했습니다.");
									System.out.println(dbAcc2 + "님의 계좌 잔액 : " + acc2Total);
									System.out.println(dbAcc1 + "님의 계좌 잔액 : " + acc1Total);
								}
							}
						}else if(selectMenu == 4) {
							if(acc == dbAcc1) {
								System.out.print("현재 잔액 : " + dbMoney1);
							}else {
								System.out.print("현재 잔액 : " + dbMoney2);
							}
						}else {
							System.out.println("1번부터 4번까지의 번호 중 하나를 선택해주세요.");
						}
					}else {
						System.out.println("계좌번호 혹은 비밀번호를 확인해주세요");
					}
				}
			}else if(loginMenu == 2) { // 로그아웃 버튼 클릭
				if(login == false) {
					System.out.println("이미 로그아웃 상태입니다.");
				}else {
					System.out.println("로그아웃 되었습니다.");
					login = false;
				}
			}else if(loginMenu == 3) { // 종료 버튼 클릭
				System.out.println("프로그램을 종료합니다.");
				run = false;
			} else { // 1~3 이외의 버튼 클릭
				System.out.println("1번부터 3번까지의 번호중 하나를 선택해주세요");
			}
		}
		
	}

}
