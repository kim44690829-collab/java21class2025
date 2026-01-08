package classPart08;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassEx08 ex08 = new ClassEx08();
		ex08.name = "Mega Bank";
		
		boolean run = true;
		while(run) {
			ex08.accList();
			ex08.bankMain();
			System.out.print("선택 : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.print("계좌번호 : ");
				String newAcc = scan.next(); // 새롭게 생성할 계좌
				System.out.print("비밀번호 : ");
				String newPw = scan.next(); // 새롭게 생성할 계좌의 비밀번호
				System.out.print("금액 : ");
				int pushMoney = scan.nextInt(); // 새롭게 생성한 계좌에 넣을 금액
				ex08.signUp(newAcc, newPw, pushMoney);
			}else if(sel == 2) {
				System.out.print("계좌번호 : ");
				String accChk = scan.next(); // 새롭게 생성할 계좌
				System.out.print("비밀번호 : ");
				String pwChk = scan.next(); // 새롭게 생성할 계좌의 비밀번호
				ex08.login(accChk, pwChk);
			}else if(sel == 3) {
				ex08.logout();
			}else if(sel == 4) {
				if(ex08.loginCheck == -1) {
					System.out.println("로그인 해야 이용할 수 있는 서비스입니다.");
				}else {
					System.out.print("입금액 : ");
					int depositMoney = scan.nextInt();
					ex08.deposit(depositMoney);
				}
			}else if(sel == 5) {
				if(ex08.loginCheck == -1) {
					System.out.println("로그인 해야 이용할 수 있는 서비스입니다.");
				}else {
					System.out.print("이체받을 사람의 계좌를 입력해주세요 : ");
					String otherAcc = scan.next();
					for(int i = 0; i < ex08.arAcc.length; i++) {
						if(!ex08.arAcc[i].equals(otherAcc)) {
							System.out.println("상대 계좌번호를 확인해주세요.");
							break;
						}else {
							System.out.print("이체할 금액을 입력해주세요 : ");
							int transferMoney = scan.nextInt();
							ex08.transfer(otherAcc, transferMoney);
						}
					}
					
				}
			}else if(sel == 6) {
				if(ex08.loginCheck == -1) {
					System.out.println("로그인 해야 이용할 수 있는 서비스입니다.");
				}else {
					ex08.balance();
				}
			}else if(sel == 0) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}else {
				System.out.println("0부터 6까지의 번호 중 하나를 선택해주세요.");
			}
		}

	}

}
