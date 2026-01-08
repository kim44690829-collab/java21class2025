package classPart08;

public class ClassEx08 {
	String name = "";
	String[] arAcc = {"1111", "2222", "3333", "4444", "5555","","","","",""};
	String[] arPw = {"1234", "2345", "3456", "4567", "5678","","","","",""};
	int[] arMoney = {87000, 34000, 17500, 98000, 12500,0,0,0,0,0};
	
	int count = 5;
	
	int loginCheck = -1; // 로그아웃 / 0 ~ 9 까지
	
	public ClassEx08() {}
	
	// 계좌 프린트문
	public void accList() {
		System.out.println("---------------------");
		System.out.println("계좌번호\t비밀번호\t계좌잔액");
		for(int i = 0; i < arAcc.length; i++) {
			if(arAcc[i] != "" && arPw[i] != "" && arMoney[i] != 0) {
				System.out.println(arAcc[i] + "\t" + arPw[i] + "\t" + arMoney[i]);
			}
			
		}
		System.out.println("---------------------");
		System.out.println();
	}
	
	// 메뉴 프린트문
	public void bankMain() {
		System.out.println("[" + name + "]");
		if(loginCheck == -1) {
			System.out.println("상태 : 로그아웃");
		}else {
			System.out.println("상태 : " + arAcc[loginCheck] + " 로그인 중");
		}
		System.out.println("[1]회원가입\n[2]로그인\n[3]로그아웃\n[4]입금\n[5]이체\n[6]잔액조회\n[0]종료\n");
	}
	
	// 회원가입
	public void signUp(String newAcc, String newPw, int pushMoney) {
		for(int i = 0; i < arAcc.length; i++) {
			if(newAcc.equals(arAcc[i])) {
				System.out.println("이미 존재하는 계좌번호입니다.");
				break;
			}
		}
		System.out.println("가입 성공");
		arAcc[count] = newAcc;
		arPw[count] = newPw;
		arMoney[count] = pushMoney + 1000;
		count++;
	}
	
	// 로그인
	public void login(String accChk, String pwChk) {
		int accNum = 0;
		int pwNum = 0;
		for(int i = 0; i < arAcc.length; i++) {
			if(accChk.equals(arAcc[i]) && pwChk.equals(arPw[i])) {
				accNum = i;
				pwNum = i;
			}
		}
		if(accChk.equals(arAcc[accNum]) && pwChk.equals(arPw[pwNum])) {
			System.out.println("로그인 성공");
			loginCheck = accNum;
		}else {
			System.out.println("계좌번호 혹은 비밀번호를 확인해주세요.");
		}
	}
	
	// 로그아웃
	public void logout() {
		if(loginCheck == -1) {
			System.out.println("현재 로그아웃 상태입니다.");
		}else {
			System.out.println("로그아웃 되었습니다.");
			loginCheck = -1;
		}
	}
	
	// 입금
	public void deposit(int depositMoney) {
		arMoney[loginCheck] += depositMoney;
		System.out.println("입금이 완료되었습니다.");
		System.out.print("현재 잔액 : ");
		System.out.print(arMoney[loginCheck]);
		System.out.println("원 입니다.");
	}
	
	// 이체
	public void transfer(String otherAcc, int transferMoney) {
		int otherAccNum = 0;
		for(int i = 0; i < arAcc.length; i++) {
			if(otherAcc.equals(arAcc[i])) {
				otherAccNum = i;
			}
		}
				
		if(transferMoney > arMoney[loginCheck]) {
			System.out.println("통장 잔액이 부족합니다.");
		}else {
			arMoney[loginCheck] -= transferMoney;
			arMoney[otherAccNum] += transferMoney;
			System.out.print("현재 잔액 : ");
			System.out.print(arMoney[loginCheck]);
			System.out.println("원 입니다.");
		}	
	}
	
	// 현재 잔액 확인
	public void balance() {
		System.out.print("현재 잔액 : ");
		System.out.print(arMoney[loginCheck]);
		System.out.println("원 입니다.");
	}
}
