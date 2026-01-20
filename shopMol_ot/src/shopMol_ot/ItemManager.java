package shopMol_ot;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemManager {
	Scanner scan = new Scanner(System.in);
	
	// 카테고리 String 자료형, ArrayList<> 생성
	ArrayList<String> category = new ArrayList<>();
	
	// 전체 아이템 리스트를 item 자료형으로 ArrayList<> 생성
	ArrayList<Item> itemList = new ArrayList<>();
	// [0] => {name : ~, price : ~, category : ~}, [1] => 위와 동일
	
	// 장바구니 => Cart 클래스를 자료형으로 ArrayList<> 생성
	ArrayList<Cart> cartList = new ArrayList<>();
	
	// 객체화
	UserMenu user = new UserMenu();
	
	// 디폴트 생성자
	public ItemManager() {info();}
	
	// 아이템 추가 => ArrayList<>에서 추가 => add()
	public void addItem(String name, int price, String category) {
		itemList.add(new Item(name, price, category));
	}
	
	// 카테고리 추가 메서드
	public void info(){
		category.add("과자"); // index 0
		category.add("생선"); // index 1
		category.add("육류"); // index 2
		category.add("음료수"); // index 3
		
		addItem("새우깡", 1000, category.get(0));
		addItem("고등어", 2000, category.get(1));
		addItem("칸쵸", 3600, category.get(0));
		addItem("소고기", 6500, category.get(2));
		addItem("돼지고기", 5500, category.get(2));
		addItem("콜라", 1000, category.get(3));
		addItem("사이다", 1500, category.get(3));
		addItem("새우", 1800, category.get(1));
	}
	
	// 카테고리 출력 메서드
	public void printCategory() {
		for(int i = 0; i < category.size(); i++) {
			System.out.println("[" + i + "]" + category.get(i));
		}
	}
	
	// 아이템 목록 출력 메서드
	public void printItemList() {
		for(int i = 0; i < itemList.size(); i++) {
			System.out.print("[" + i + "]" ); 
			itemList.get(i).printInfo();
		}
	}
	
	// 장바구니
	// usId, caId => 카테고리 index 번호 , itemId => item index번호
	public void addCart(String usId,  int itemId) {
		// 이미 장바구니에 아이템 존재하는지 검사
		// 이미 존재하면 수량누적, 가격누적
		
		int cnt = 0; // 개수
		int jangCnt = 0; // 장바구니에 중복된 데이터의 유무 체크
		int log = user.logIndex; // userMenu 클래스의 로그인된 log값을 static으로 공유
		
		// Cart 인스턴스화
		Cart temp = new Cart(); // temp : 임시 기억 장소(개발분야)
		temp.userId = usId;
		
		for(int i = 0; i < itemList.size(); i++) {
			// 비교해야 할 조건
			// 이미 장바구니에 아이템 존재하는지 검사
			// itemList.get(0).name => 새우깡
			// itemList.get().name
			if(itemList.get(itemId).name.equals(itemList.get(i).name)) {
				// true => 누적
				jangCnt = 0;
				for(int j = 0; j < cartList.size(); j++) {
					// 비교
					if(cartList.get(j).itemName.equals(itemList.get(itemId).name) && cartList.get(j).userId.equals(user.id[log])) {
						// 가격 누적, 수량 누적
						cartList.get(j).price += itemList.get(i).price;
						cartList.get(j).quantity += 1;
						jangCnt += 1;
					}
				}
				// 장바구니에 상품이 존재하지 않을때
				if(jangCnt == 0) {
					temp.itemName = itemList.get(i).name;
					temp.price = itemList.get(i).price;
					cnt += 1;
					temp.quantity = cnt;
					// 장바구니 추가
					cartList.add(temp);
				}
			}
		}
	}
	
	// 장바구니 출력 메서드
	public void printJang() {
		for(int i = 0; i < cartList.size(); i++) {
			cartList.get(i).printCart();
		}
	}
	
	// 전체 아이템 추가
	public void addItem02(String addName, int addPrice, int categoryNum) {
		// item 클래스 추가
		Item temp = new Item(addName, addPrice, category.get(categoryNum));
		itemList.add(temp);
	}
	
	// 전체 아이템 삭제
	public void delItem(int delIndex) {
		itemList.remove(delIndex);
	}
	
	// 전체 아이템 수정
	public void updateItem(int indexNum, String upName, int upPrice) {
		itemList.get(indexNum).name = upName;
		itemList.get(indexNum).price = upPrice;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
