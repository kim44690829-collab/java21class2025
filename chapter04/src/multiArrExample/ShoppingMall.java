package multiArrExample;

import java.util.*;

public class ShoppingMall {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int status = 0; // 0 : 로그아웃 / 1 : qwer / 2 : javaking / 3 : abcd
		
		String[] ids = {"qwer", "javaking", "abcd"}; // id
		String[] pws = {"1111","2222","3333"}; // pw
		
		int idNum = 0; // id 인덱스 값
		int pwNum = 0; // pw 인덱스 값
		
		String[] items = {"사과", "바나나", "딸기"}; // 제품 목록
		
		int MAX_SIZE = 100; // 장바구니 최대 저장공간
		int[][] jang = new int[MAX_SIZE][2]; // 장바구니 전체 저장 목록
		int[][] cart = new int[ids.length][items.length]; // 장바구니 회원별 저장 목록
		
		int count = 0;
		
		boolean run = true;
		
		while(run) {
			System.out.println();
			System.out.println("-------------");
			if(status == 0) {
				System.out.println("상태 : 로그아웃");
			}else if(status == 1) {
				System.out.println("상태 : qwer");
			}else if(status == 2) {
				System.out.println("상태 : javaking");
			}else {
				System.out.println("상태 : abcd");
			}
			System.out.println("-------------");
			
			System.out.println("[GREEN MART]\n[1]로그인\n[2]로그아웃\n[3]쇼핑\n[4]장바구니\n[0]종료\n");
			System.out.print("메뉴 선택 : ");
			int menu = scan.nextInt();
			if(menu == 1) { // 로그인
				if(status != 0) {
					System.out.println("이미 로그인 상태입니다.");
				}else {
					System.out.print("ID 입력 : ");
					String idChk = scan.next();
					System.out.print("PW 입력 : ");
					String pwChk = scan.next();
					for(int i = 0; i < ids.length; i++) { // id의 인덱스 뽑아내기
						if(ids[i].equals(idChk)) {
							idNum = i;
						}
					}
					for(int i = 0; i < ids.length; i++) { // pw의 인덱스 뽑아내기
						if(pws[i].equals(pwChk)) {
							pwNum = i;
						}
					}
					
					if(idNum == pwNum) { // id의 인덱스와 pw의 인덱스가 같으면 로그인 성공
						System.out.println(idChk + "님, 환영합니다.");
						status = idNum + 1;
						
					}else { // 인덱스가 다르면 로그인 실패
						System.out.println("아이디 혹은 비밀번호를 확인해주세요.");
					}
				}
			}else if(menu == 2) { // 로그아웃
				if(status != 0) { // 현재 로그인 중이면
					status = 0;
					System.out.println("로그아웃 되었습니다.");
				}else { // 현재 로그아웃 중이면
					System.out.println("현재 로그아웃 상태입니다.");
				}
			}else if(menu == 3) { // 쇼핑하기
				if(status == 0) {
					System.out.println("로그인을 해야 이용할 수 있는 서비스입니다.");
				}else {
					while(true) {
						System.out.println("[상품 목록]"); // 상품 목록
						for(int i = 0; i < items.length; i++) {
							int itemNum = i+1;
							System.out.println("[" + itemNum + "] " + items[i]);
						}
						System.out.println("[4] 뒤로가기");
						System.out.print("상품 번호를 선택하세요 : "); // 상품 번호 선택
						int itemSelect = scan.nextInt();
						if(itemSelect == 4) {
							break;
						}else {
							jang[count][0] = status - 1;
							jang[count][1] = itemSelect - 1;
							count++;
							for(int i = 0; i < cart.length; i++) {
								if(i == status - 1) {
									cart[i][itemSelect - 1] += 1;
								}
							}
						}
						for(int i = 0; i < count; i++) {
							for(int j = 0; j < jang[i].length; j++) {
								System.out.print(jang[i][j]);
							}
							System.out.println();
						}
					}
				}
			}
			else if(menu == 4) {
				if(status == 0) {
					System.out.println("로그인을 해야 이용할 수 있는 서비스입니다.");
				}else {
					System.out.println("-------------");
					System.out.println("내 장바구니 목록");
					System.out.println("-------------");
					
					for(int i = 0; i < cart.length; i++) {
						for(int j = 0; j < cart[i].length; j++) {
							if(i == status - 1) {
								System.out.println(items[j] + ": " + cart[i][j] + "개");
							}
						}
					}
				}
			}else if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}else {
				System.out.println("0번부터 4번 사이의 번호를 선택해주세요.");
			}
		}
		
	}

}
