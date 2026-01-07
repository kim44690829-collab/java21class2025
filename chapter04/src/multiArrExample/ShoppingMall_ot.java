package multiArrExample;

import java.util.*;

public class ShoppingMall_ot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int status = -1; // 0 : 로그아웃 / 1 : qwer / 2 : javaking / 3 : abcd
		
		int count = 0; // 아이템을 사는 개수
		
		String[] ids = {"qwer", "javaking", "abcd"}; // id
		String[] pws = {"1111","2222","3333"}; // pw
		
		int idNum = 0; // id 인덱스 값
		int pwNum = 0; // pw 인덱스 값
		
		String[] items = {"사과", "바나나", "딸기"}; // 제품 목록
		
		int MAX_SIZE = 100; // 장바구니 최대 저장공간
		int[][] jang = new int[MAX_SIZE][2]; // 장바구니 전체 저장 목록
		int[][] cartCount = new int[ids.length][items.length]; // 장바구니 회원별 상품별 개수를 담는 변수
		
		boolean run = true;
		
		while(run) {
			System.out.println();
			System.out.println("-------------");
			if(status == -1) {
				System.out.println("상태 : 로그아웃");
			}else {
				System.out.println(ids[status]);
			}
			System.out.println("-------------");
			System.out.println("[GREEN MART]\n[1]로그인\n[2]로그아웃\n[3]쇼핑\n[4]장바구니\n[0]종료\n");
			System.out.print("메뉴 선택 : ");
			int menu = scan.nextInt();
			if(menu == 1) { // 로그인
				System.out.print("ID 입력 : ");
				String idChk = scan.next();
				System.out.print("PW 입력 : ");
				String pwChk = scan.next();
				
				// 로그인 성공 boolean
				boolean loginSuccess = false;
				for(int i = 0; i < ids.length; i++) {
					if(ids[i].equals(idChk) && pws[i].equals(pwChk)) {
						status = i;
						loginSuccess = true;
						break;
					}
				}
				if(loginSuccess) {
					System.out.println(ids[status] + "님 환영합니다.");
				}else {
					System.out.println("아이디 혹은 비밀번호를 확인해주세요.");
				}
			}else if(menu == 2) {
				status = -1;
				System.out.println("로그아웃 되었습니다.");
			}else if(menu == 3) {
				if(status == -1) {
					System.out.println("로그인 후 이용가능");
					continue;
				}
				// 4번을 누르기 전까지 제품 목록들이 반복출력
				while(run) {
					System.out.println("[상품 목록]");
					for(int i = 0; i < items.length; i++) {
						System.out.printf("[%d]%s%n",(i+1),items[i]);
					}
					System.out.println("[4]뒤로가기");
					System.out.print("상품 번호를 선택하세요 : ");
					int itemNum = scan.nextInt();
					if(itemNum == 4) {
						// 뒤로가기
						break;
					}
					// MAX_SIZE 100이 넘어가면 예외처리
					if(count == MAX_SIZE) {
						System.out.println("더이상 물건을 추가하실 수 없습니다.");
						break;
					}
					
					// ids별 쇼핑한 items 별들의 개수를 cartCount에 담는다.
					jang[count][0] = status; // 장바구니 0번째 열에 login한 index번호
					jang[count][1] = itemNum - 1; // 장바구니 1번째 열에 내가 산 아이템 index 번호
					// id별 쇼핑한 item들의 개수를 item별로 cartCount에 담는다.
					cartCount[status][itemNum - 1]++;
					// status = 0 => qwer / itemNum-1 => 0 , 상품 사과
					count++;
				}
			}else if(menu == 4) {
				if(status == -1) {
					System.out.println("로그인 후 이용가능한 서비스입니다.");
				}else {
					System.out.println("--- 내 장바구니 목록 ---");
					for(int i = 0; i < items.length; i++) {
						System.out.println(items[i] + ": " + cartCount[status][i] + "개");
					}
				}
			}else if(menu == 0) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("1번부터 4번까지의 번호중 하나를 선택해주세요.");
			}
		}
		scan.close();
	}

}
