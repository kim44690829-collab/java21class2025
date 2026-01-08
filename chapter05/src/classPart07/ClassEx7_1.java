package classPart07;

import java.util.Scanner;

public class ClassEx7_1 {

	// 멤버 변수 이면서 전역변수
	int[] arrPrice = {2500, 3800, 1500, 1000};
	String[] arrMenu = {"치즈버거", "불고기버거", "감자튀김", "콜 라"};
	
	int[] arrCount = new int[4]; // 각 메뉴별 개수
	int total = 0;
	String name;
	
	// 객체 생성 시 초기화에 필요한 디폴트 생성자
	// 생성자는 반드시 클래스 이름과 동일해야함.
	public ClassEx7_1() {}
	
	// 메뉴 출력하는 함수
	// void 는 반환할 값이 없는 메서드를 생성할 때 사용
	public void menuList() {
		System.out.println("\n[" + name + "]");
		for(int i = 0; i < arrMenu.length; i++) {
			System.out.println((i + 1) + ". " + arrMenu[i] + "(" + arrPrice[i] + "원)");
		}
		System.out.println("5. 주문하기");
		System.out.println();
	}
	
	// 주문 추가 함수
	public void order(int sel) {
		arrCount[sel]++;
		System.out.println(arrMenu[sel] + "가 추가되었습니다.");
	}
	
	// 총 금액 계산 함수
	public void calcTotal() {
		total = 0;
		for(int i = 0; i < arrMenu.length; i++) {
			total += (arrPrice[i] * arrCount[i]);
		}
	}
	
	// 주문 여부를 확인하는 메서드
	// 반환할 값이 필요한 경우 반드시 데이터 타입으로 메서드를 작성한다.
	public boolean hasOrder() {
		for(int i = 0; i < arrMenu.length; i++) {
			if(arrCount[i] > 0) {
				return true;
			}
		}
		return false; // 주문 안됨
	}
	
	// 영수증 출력
	public void printReceipt(int money) {
		System.out.println("=== 영수증 출력 ===");
		System.out.println("매장 명 : " + name);
		System.out.println("----------------");
		System.out.println("메뉴\t수량\t금액");
		
		for(int i = 0; i < arrMenu.length; i++) {
			if(arrCount[i] > 0) {
				System.out.println(arrMenu[i] + "\t" + arrCount[i] + "\t" + (arrPrice[i] * arrCount[i]));
			}
		}
		
		System.out.println("----------------");
		System.out.println("총 금액 : " + total);
		System.out.println("받은 돈 : " + money);
		System.out.println("잔 돈 : " + (money - total));
		System.out.println("----------------");
	}
}
