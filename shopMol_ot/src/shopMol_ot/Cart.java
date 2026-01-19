package shopMol_ot;

public class Cart {
	// 멤버 변수
	String userId; // 구매한 유저 id
	String itemName; // 구매한 물품 이름
	int price; // 구매한 물품의 가격
	int quantity; // 구매 수량
	
	// 디폴트 생성자
	public Cart() {}
	
	// 매개변수 생성자
	public Cart(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}
	
	// cart 출력 메서드
	public void printCart() {
		System.out.println(" [ " + userId + " ] " + itemName + ", 금액 : " + price + ", 수량 : " + quantity + "개");
	}
}
