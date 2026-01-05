package multiArrExample;

import java.util.Scanner;

public class String_example05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		int categoryNum = 0;
		
		String[][] items = new String[100][2];
		
		for(int i = 0; i < items.length; i++) {
			for(int j = 0; j < items[i].length; j++) {
				items[i][j] = "";
			}
		}
		
		
		while(run) {
			System.out.println();
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리\n[2]아이템 관리\n[3]전체품목 출력\n[0]종료\n");
			System.out.print("관리자 모드를 선택하세요 : ");
			int modeSelect = scan.nextInt(); // 관리자 모드 선택
			if(modeSelect == 1) {
				System.out.print("추가할 카테고리 입력 : ");
				String category = scan.next();
				
				items[categoryNum][0] = category;
				categoryNum++;
				
			}else if(modeSelect == 2) {
				for(int i = 0; i < items.length; i++) {
					if(items[i][0] != "") {
						System.out.println("["+ i + "] " + items[i][0]);
					}
				}
				System.out.print("카테고리를 선택하세요 : ");
				int selectCate = scan.nextInt();
				System.out.print("추가할 아이템을 입력하세요 : ");
				String pushItem = scan.next();
				items[selectCate][1] += pushItem + " / ";
				
			}else if(modeSelect == 3) {
				for(int i = 0; i < items.length; i++) {
					if(items[i][0] != "") {
						System.out.println(items[i][0] + " : " + items[i][1] );
					}
				}
			}else if(modeSelect == 0) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}else {
				System.out.println("0번부터 3번 사이의 번호를 입력해주세요.");
			}
			
		}
		
		
	}

}
