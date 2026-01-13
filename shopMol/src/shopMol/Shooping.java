package shopMol;

import java.util.Scanner;

public class Shooping extends UserMenu{
	Scanner scan = new Scanner(System.in);
	String idChk;
	String pwChk;
	ItemManager itemManage = new ItemManager();
	
	//메뉴
	public void menu() {
		boolean run = true;
		while(run){
			System.out.println("[1] 로그인\n[2] 로그아웃\n[3] 쇼핑\n[0] 종료\n");
			System.out.print("메뉴 선택 : ");
			int menuSel = scan.nextInt();
			if(menuSel == 1) {
				login();
				System.out.println();
			}else if(menuSel == 2) {
				logout();
				System.out.println();
			}else if(menuSel == 3) {
				shopMenu();
				System.out.println();
			}else if(menuSel == 0) {
				run = false;
				System.out.println("안녕히계세요.");
			}else {
				System.out.println("0번부터 3번까지의 번호 중 하나를 선택해주세요.");
			}
		}
		
	}
	
	//쇼핑메뉴
	public void shopMenu() {
		super.userLog();
		if(log != -1) {
			boolean shopRun = true;
			while(shopRun) {
				System.out.println();
				System.out.print("[1] 쇼핑목록\n[2] 장바구니\n[0] 뒤로가기\n메뉴 선택 : ");
				int shopSel = scan.nextInt();
				if(shopSel == 1) {
					
				}else if(shopSel == 2) {
					
				}else if(shopSel == 0) {
					shopRun = false;
				}else {
					System.out.println("0번부터 2번까지의 메뉴 중 하나를 선택해주세요.");
				}
			}
		}
	}
	
	// 쇼핑 메뉴 1번
	public void shopMenu1() {
		
	}
	
	// 쇼핑 메뉴 2번
	public void shopMenu2() {
		
	}
	
	//로그인 메서드
	public void login() {
		System.out.print("ID 입력 : ");
		idChk = scan.next();
		System.out.print("PW 입력 : ");
		pwChk = scan.next();
		if(idChk.equals("mmm") && pwChk.equals("123")) {
			System.out.println("당신은 관리자입니다.");
			System.out.println();
			// 관리자 화면
			manager();
		}else {
			for(int i = 0; i < super.id.length; i++) {
				if(super.id[i].equals(idChk) && super.pw[i].equals(pwChk)) {
					super.log = i;
				}
			}
			if(super.log == -1) {
				System.out.println("아이디 혹은 비밀번호를 확인해주세요.");
			}else {
				System.out.println("[" + id[super.log] + "]님, 환영합니다." );
			}
		}
	}
	
	// 관리자 전용 화면
	public void manager() {
		boolean managerRun = true;
		while(managerRun) {
			System.out.print("[1] 로그아웃\n[2] [아이템 관리]\n[3] [장바구니 리스트]\n메뉴 선택 : ");
			int managerSel = scan.nextInt();
			if(managerSel == 1) {
				log = -1;
				System.out.println("안녕히계세요.");
				managerRun = false;
			}else if(managerSel == 2) {
				itemM();
			}else if(managerSel == 3) {
				
			}else {
				System.out.println("1번부터 3번까지의 메뉴 중 하나를 선택해주세요.");
			}
		}
	}
	
	// 관리자의 아이템 관리
	public void itemM() {
		boolean itemManageRun = true;
		while(itemManageRun) {
			System.out.println();
			System.out.print("[1] [item 추가]\n[2] [item 삭제]\n[3] [item 수정]\n[0] 종료\n메뉴 선택 : ");
			int itemManagerSel = scan.nextInt();
			System.out.println();
			if(itemManagerSel == 1) {
				addItem();
			}else if(itemManagerSel == 2) {
				removeItem();
			}else if(itemManagerSel == 3) {
				
			}else if(itemManagerSel == 0) {
				itemManageRun = false;
			}else {
				System.out.println("0번부터 3번까지의 메뉴 중 하나를 선택해주세요.");
			}
		}
	}
	
	// 관리자의 아이템 추가
	public void addItem() {
		System.out.println("추가할 item의 category 번호를 입력하세요.");
		itemManage.printCategory();
		System.out.println();
		int categorySel = scan.nextInt();
		System.out.println("추가할 item의 이름을 입력하세요.");
		String itemName = scan.next();
		System.out.println("추가할 item의 가격을 입력하세요.");
		int itemPrice = scan.nextInt();
		itemManage.itemList.add(new Item(itemName, itemPrice, itemManage.category.get(categorySel)));
		itemManage.printItemList();
	}
	
	// 관리자의 아이템 삭제
	public void removeItem() {
		itemManage.printItemList();
		System.out.print("삭제할 아이템 번호를 입력하세요 : ");
		int removeItemNum = scan.nextInt();
		itemManage.itemRemove(removeItemNum);
		itemManage.printItemList();
	}
	
	// 관리자의 장바구니 리스트
	
	//로그아웃 메서드
	public void logout() {
		super.userLog();
		if(log != -1) {
			log = -1;
			System.out.println("안녕히계세요.");
		}
	}
}
