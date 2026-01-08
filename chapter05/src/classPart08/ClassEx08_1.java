package classPart08;

public class ClassEx08_1 {
	String name = "";
	String[] arAcc = {"1111", "2222", "3333", "4444", "5555","","","","",""};
	String[] arPw = {"1234", "2345", "3456", "4567", "5678","","","","",""};
	int[] arMoney = {87000, 34000, 17500, 98000, 12500,0,0,0,0,0};
	
	int count = 5; // 비어있는 인덱스를 누적하는 변수
	
	int loginCheck = -1; // 로그아웃 / 0 ~ 9 까지
	
	public ClassEx08_1() {}
	
	// 상태 출력 함수
	public void printStatus() {
		if(loginCheck == -1) {
			System.out.println("상태 : 로그아웃");
		}else {
			System.out.println("상태 : " + arAcc[loginCheck] + " 로그인 중...");
		}
	}
	
	// 회원가입 함수
	public boolean join(String acc, String pw, int money){
		// 아이디 중복체크
		for(int i = 0; i < arAcc.length; i++) {
			if(arAcc[i].equals(acc)) return false; // 아이디 중복
		}
		
		// 가입
		arAcc[count] = acc;
		arPw[count] = pw;
		arMoney[count] = money + 1000;
		count++;
		return true;
	}
	
	// 로그인
	public boolean login(String acc, String pw) {
		// 현재 로그인 상태인지 확인
		if(loginCheck != -1) return false; // 현재 로그인 상태
		
		// id와 비밀번호가 같은지 체크
		for(int i = 0; i < arAcc.length; i++) {
			if(arAcc[i].equals(acc) && arPw[i].equals(pw)) {
				loginCheck = i;
				return true; // 아이디 비밀번호 일치
			}
		}
		return false; // 아이디 비밀번호 불일치
	}
	
	// 로그아웃
	public void logout() {
		loginCheck = -1;
	}
	
	// 입금
	public void diposit(int money) {
		arMoney[loginCheck] += money;
	}
	
	// 이체
	public boolean transfer(String acc, int money) {
		int target = -1; // 이체하고 싶은 계좌번호가 존재하는지 체크
		for(int i = 0; i < arAcc.length; i++) {
			if(arAcc[i].equals(acc)) {
				target = i; // 현재 계좌번호 존재
				break;
			}
		}
		// 대상이 되는 계좌번호가 없거나 이체금액이 부족하면 false
		if(target == -1 || arMoney[loginCheck] < money) return false;
		
		// 이체 => 내통장 마이너스, 상대통장 플러스
		arMoney[loginCheck] -= money;
		arMoney[target] += money;
		return true;
	}
	
	// 잔액
	public int getBalance() {
		return arMoney[loginCheck];
	}
	
	public boolean isLogin() {
		return loginCheck == -1; // 로그아웃 상태일때 true;
	}
	
}
