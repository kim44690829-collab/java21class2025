package shopMol_ot;

import java.util.Scanner;

public class Shopping extends UserMenu{
	// 쇼핑 메뉴
	// 인스턴스화
	ItemManager it = new ItemManager();
	Scanner scan = new Scanner(System.in);
	String menu = "[1] 로그인\n[2] 로그아웃\n[3] 쇼핑\n[0] 종료\n";
	String mageMenu = "[1] 로그아웃\n[2] [아이템 관리]\n[3] [장바구니 리스트]\n";
	String itemMenu = "[1] [item 추가]\n[2] [item 삭제]\n[3] [item 수정]\n[0] 종료\n";
	
	// 메뉴 -----------------------------
	public void menu() {
		while(true) {
			System.out.println();
			System.out.print(menu);
			System.out.print("메뉴 선택 : ");
			int select = scan.nextInt();
			
			if(select == 1) {
				login();
				if(log == 0) {
					mangerMenu();
				}
			}else if(select == 2) {
				 logout();
			}else if(select == 3) {
				// 쇼핑은 반드시 로그인상태여야함
				if(log < 0) { // log => -1 : 로그아웃
					System.out.println("로그인 후 이용가능");
				}else {
					// 로그인 상태 (log > 0)
					 shopMenu();
				}
			}else {
				System.out.println("쇼핑몰 종료");
				break;
			}
		}
	}
	
	// shopMenu();
	public void shopMenu() {
		while(true) {
			System.out.println();
			System.out.println("[1] 쇼핑목록\n[2] 장바구니\n[0] 뒤로가기\n");
			int select = scan.nextInt();
			if(select == 0) {
				break;
			}else if(select == 1) {
				it.printCategory();
				System.out.print("쇼핑 목록 선택 [뒤로가기 : -1] : ");
				int caid = scan.nextInt();
				
				int n = 0;
				for(int i = 0; i < it.itemList.size(); i++) {
					// 카테고리 인덱스 번호, 해당 상품이 존재하는지 비교
					if(it.category.get(caid).equals(it.itemList.get(i).category)) {
						System.out.print("[" + i + "]");
						it.itemList.get(i).printInfo();
					}
				}
				System.out.print("항목을 선택 : ");
				int itemId = scan.nextInt();
				// 항목 추가 => 장바구니 카트에 추가
				
				it.addCart(super.id[log], itemId);
			}else if(select == 2) {
				System.out.println("========== 내 장바구니 ==========");
				for(int i = 0; i < it.cartList.size(); i++) {
					// 로그인 한 아이디가 장바구니의 아이디와 같은지 확인
					// 장바구니에 물건을 산 고객의 id별로 저장 => 그 아이디와 현재 로그인한 아이디가 같은지 확인
					if(it.cartList.get(i).userId.equals(id[log])) {
						it.cartList.get(i).printCart();
					}
				}
			}
		}
	}
	
	// 관리자 메뉴
	public void mangerMenu() {
		while(true) {
			System.out.println();
			System.out.println(mageMenu);
			System.out.print("메뉴 선택 : ");
			int select = scan.nextInt();
			if(select == 1) {
				logout();
				break;
			}else if(select == 2) {
				 itemMage();
			}else {
				System.out.println("========== 장바구니 리스트 ==========");
				it.printJang();
				System.out.println("==================================");
			}
		}
	}
	
	// 로그인
	public void login() {
		if(log > -1) {
			System.out.println("이미 로그인 중입니다.");
		}else {
			log = super.userLog();
		}
	}
	
	// 로그아웃
	public void logout() {
		if(log < 0) {
			System.out.println("로그아웃 상태입니다.");
		}else {
			log = -1;
			System.out.println("안녕히계세요.");
		}
	}
	
	// 아이템 관리 메뉴
	public void itemMage() {
		while(true) {
			System.out.println();
			System.out.println(itemMenu);
			System.out.print("메뉴 선택 : ");
			int select = scan.nextInt();
			
			if(select == 1) {
				System.out.print("추가할 item 이름 입력 : ");
				String addName = scan.next();
				System.out.print("추가할 item 금액 입력 : ");
				int addPrice = scan.nextInt();
				System.out.print("추가할 item의 카테고리 번호를 입력 : ");
				int categoryNum = scan.nextInt();
				// 상품 추가
				it.addItem02(addName, addPrice, categoryNum);
				it.printItemList();
			}else if(select == 2) {
				System.out.print("삭제할 item 번호 입력 : ");
				int delIndex = scan.nextInt();
				it.delItem(delIndex);
				it.printItemList();
			}else if(select == 3) {
				System.out.print("수정할 item 번호 입력 : ");
				int indexNum = scan.nextInt();
				System.out.print("수정할 item 이름 입력 : ");
				String upName = scan.next();
				System.out.print("수정할 item 가격 입력 : ");
				int upPrice = scan.nextInt();
				it.updateItem(indexNum, upName, upPrice);
				it.printItemList();
			}else {
				System.out.println("아이템 관리 종료");
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
