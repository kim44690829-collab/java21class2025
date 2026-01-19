package shopMol_ot;

import java.util.Scanner;

// user 상속받아야한다.
public class UserMenu extends User {
	// 상속 받은 User의 멤버변수, 생성자, 메서드 접근 가능 => 인스턴스화 하지 않아도 접근 가능
	Scanner scan = new Scanner(System.in);
	int cnt = id.length; // 전체 user 수 (6명)
	static int logIndex; // 로그인 한 유저 인덱스 (다른 클래스와 공유)
	
	// 사용자 로그인 메서드
	public int userLog() {
		// 부모 클래스 멤버변수 접근 : super.
		int log = super.log; // 부모인 User클래스의 로그인 상태 사용
		System.out.print("ID 입력 : ");
		String myId = scan.next();
		System.out.print("PW 입력 : ");
		String myPw = scan.next();
		
		// id, pw로 로그인 성공, 실패 
		for(int i = 0; i < cnt; i++) {
			if(myId.equals(id[i]) && myPw.equals(pw[i])) {
				log = i; // 로그인 성공 -> 해당 인덱스 저장
			}
		}
		
		// if문으로 비교
		if(log < 0) {
			System.out.println("아이디와 비밀번호를 확인해주세요.");
		}else if(log == 0) {
			System.out.println("당신은 관리자 입니다.");
		}else {
			System.out.println("[" + id[log] + "]" + "님 환영합니다.");
			logIndex = log; // 다른 클래스에서 사용하기 위해 공유
		}
		
		return log;
	}
	
}
