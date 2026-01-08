package classPart08;

import java.util.Scanner;

public class MainClass_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassEx08_1 ex08 = new ClassEx08_1();
		ex08.name = "Mega Bank";
		
		boolean run = true;
		while(run) {
			System.out.println("---------------------");
			System.out.println("계좌번호\t비밀번호\t계좌잔액");
			System.out.println("---------------------");
			for(int i = 0; i < ex08.count; i++) {
				System.out.println(ex08.arAcc[i] + "\t" + ex08.arPw[i] + "\t" + ex08.arMoney[i]);
			}
			System.out.println("---------------------");
			System.out.println("\n[" + ex08.name + "]");
			ex08.printStatus();
			System.out.println("[1]회원가입\n[2]로그인\n[3]로그아웃\n[4]입금\n[5]이체\n[6]잔액조회\n[0]종료\n");
			System.out.print("선택 : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.print("계좌번호 : ");
				String acc = scan.next(); // 새롭게 생성할 계좌
				System.out.print("비밀번호 : ");
				String pw = scan.next(); // 새롭게 생성할 계좌의 비밀번호
				System.out.print("금액 : ");
				int money = scan.nextInt(); // 새롭게 생성한 계좌에 넣을 금액
				// 회원가입 함수 호출
				System.out.println(ex08.join(acc, pw, money) ? "가입 성공" : "중복 계좌");
				
			}else if(sel == 2) {
				System.out.print("계좌번호 : ");
				String acc = scan.next(); // 새롭게 생성할 계좌
				System.out.print("비밀번호 : ");
				String pw = scan.next(); // 새롭게 생성할 계좌의 비밀번호
				// 로그인 함수
				System.out.println(ex08.login(acc, pw) ? "로그인 성공" : "로그인 실패");
			}else if(sel == 3) {
				// 로그아웃 함수 호출
				ex08.logout();
				System.out.println("로그아웃");
			}else if(sel == 4) {
				// 입금
				// isLogin == true => 현재 로그인 상태
				if(ex08.isLogin()) continue;
				System.out.print("입금액 : ");
				int money = scan.nextInt();
				ex08.diposit(money);
			}else if(sel == 5) {
				// 이체함수 호출
				if(ex08.isLogin()) continue;
				System.out.print("상대 계좌 : ");
				String acc = scan.next();
				System.out.print("금액 : ");
				int money = scan.nextInt();
				System.out.println(ex08.transfer(acc, money) ? "이체 성공" : "이체 실패");
			}else if(sel == 6) {
				// 잔액 조회
				if(ex08.isLogin()) continue;
				System.out.println("잔액 : " + ex08.getBalance());
			}else if(sel == 0) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}else {
				System.out.println("0부터 6까지의 번호 중 하나를 선택해주세요.");
			}
		}
	}
}
