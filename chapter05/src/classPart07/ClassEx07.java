package classPart07;

import java.util.Scanner;

public class ClassEx07 {
	Scanner scan = new Scanner(System.in);
	// 멤버 변수 , 생성자, 기능 메서드
	int[] arrPrice = {2500, 3800, 1500, 1000};
	String[] arrMenu = {"치즈버거", "불고기버거", "감자튀김", "콜 라"};
	
	int[] arrCount = new int[4]; // 각 메뉴별 개수
	int total = 0;
	
	public ClassEx07() {}
	
	public void menuList() {
		System.out.println("[맘스터치 햄버거]");
		System.out.printf("1.%s	%d원%n2.%s	%d원%n3.%s	%d원%n4.%s	%d원%n", arrMenu[0], arrPrice[0], arrMenu[1], arrPrice[1], arrMenu[2], arrPrice[2], arrMenu[3], arrPrice[3]);
		System.out.println("5.주문하기");
		System.out.println("-------------------------");
		System.out.print("메뉴 선택 : ");
		int order = scan.nextInt();
	}
	
	public int menuOrder(int selectNum) {
		
		if(selectNum  == 1) {
			total += arrPrice[selectNum];
		}else if(selectNum == 2) {
			total += arrPrice[selectNum];
		}else if(selectNum == 3) {
			total += arrPrice[selectNum];
		}else if(selectNum == 4) {
			total += arrPrice[selectNum];
		}else if(selectNum == 5){
			System.out.println("총 금액은 " + total + "입니다.");
			System.out.println("돈을 입력하세요 : ");
			int money = scan.nextInt();
		}
		return total;
	}
	
	// 개수 반환
}
