package classPart07;

import java.util.*;

public class MainClass_1 {

	public static void main(String[] args) {
		// main()은 계산 로직 (X), 저장 로직 (X), 처리 로직(X)
		// main()은 객체화, 메서드 호출, 실행 순서, 스캔 등
		Scanner scan = new Scanner(System.in);
		ClassEx7_1 e7 = new ClassEx7_1(); // 객체화
		// ClassEx7_1 클래스에 접근하는 방법
		// 참조변수.멤버변수, 참조변수.메서드()
		e7.name = "맥도날드";
		
		// 순서를 정하는 파트
		boolean run = true;
		
		while(run) {
			e7.menuList();
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			// 메뉴 선택
			if(sel >= 1 && sel <= 4) {
				e7.order(sel - 1); // index는 0부터 시작
			}else if(sel == 5) {
				// 주문이 완료됐을 때
				if(!e7.hasOrder()) { // false => 주문이 안된상태
					System.out.println("주문 내역이 없습니다.");
					continue;
				}
				// 총 금액 함수 호출
				e7.calcTotal();
				System.out.println("총 금액 : " + e7.total + "원");
				System.out.print("지불 금액을 입력해주세요 : ");
				int money = scan.nextInt();
				if(money < e7.total) {
					System.out.println("지불 금액이 모자랍니다.");
					continue;
				}
				
				// 영수증 출력 함수
				e7.printReceipt(money);
				run = false;
			}
		}
		

	}

}
