package classPart11;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassEx11_1 ex11 = new ClassEx11_1();
		ex11.name = "메가IT 고등학교";
		boolean run = true;
		
		while(run) {
			System.out.println();
			System.out.println("===" + ex11.name + "===");
			System.out.println("1. 전교생 성적확인\n2. 1등학생 성적확인\n3. 꼴등학생 성적확인\n4. 성적확인\n5. 종료하기\n");
			System.out.print("메뉴 선택하기 : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				ex11.choice1();
			}else if(sel == 2) {
				ex11.choice2();
			}else if(sel == 3) {
				ex11.choice3();
			}else if(sel == 4) {
				System.out.print("학번을 입력하세요 : ");
				int hakNum = scan.nextInt();
				ex11.choice4(hakNum);
			}else if(sel == 5) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}else {
				System.out.println("1번부터 5번까지의 메뉴 중 하나를 선택해주세요.");
			}
		}
		
		
	}

}
