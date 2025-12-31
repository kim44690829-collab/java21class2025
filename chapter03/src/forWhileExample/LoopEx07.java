package forWhileExample;

import java.util.Scanner;

public class LoopEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int accNum = 0;
		int pwNum = 0;
		
		boolean login = false; 
		
		while(run == true) {
			System.out.print("1. 로그인 \n2. 로그아웃\n0.종료\n메뉴 선택 : ");
			int menu = scan.nextInt();
			if(menu == 1) {
				if(login == true) {
					System.out.println("이미 로그인 되어있습니다.");
				}else {
					System.out.print("계좌번호 입력 : ");
					accNum = scan.nextInt();
					System.out.print("비밀번호 입력 : ");
					pwNum = scan.nextInt();
					if((accNum == 1111 && pwNum == 1234) || (accNum == 2222 && pwNum == 2345)) {
						System.out.println(accNum + "님, 환영합니다.");
						login = true;
					}else {
						System.out.println("계좌번호 혹은 비밀번호를 확인해주세요");
					}
				}
			}else if(menu == 2){
				if(login == true) {
					System.out.println("로그아웃 되었습니다.");
					login = false;
				}else {
					System.out.println("현재 로그인 상태가 아닙니다.");
				}
				
			}else if(menu == 0){
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("0번부터 2번까지의 번호중에 하나를 골라주세요.");
			}
		}
		
	}

}
