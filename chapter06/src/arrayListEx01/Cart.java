package arrayListEx01;

import java.util.ArrayList;

public class Cart {
	// ArrayList<>를 이용해서 장바구니에 담는 역할
	ArrayList<Product> pro = new ArrayList<>();
	
	// 현재 작성한 Product 클래스는 데이터 타입이다.
	// Cart에서 상품 추가, 상품 삭제, 상품 출력, 상품 총계
	// 상품 추가
	// 매개변수로 데이터 타입인 Product를 넣음 / 현재 Product 클래스에 멤버변수, 생성자, 메서드에 접근할 수 있도록 Product를 데이터타입으로 사용함 
	public void addProduct(Product p) {
		pro.add(p);
	}
	
	// 상품 삭제 함수
	// ArrayList<>에서 remove는 반드시 index가 필요
	public void removeProduct(int index) {
		pro.remove(index);
	}
	
	// 상품 출력 함수
	public void showItem() {
		// 확장 for문을 이용해서 출력
		for(Product p : pro) {
			p.printItem();
		}
	}
	
	// 총계
	public int totalPrice() {
		int sum = 0;
		for(Product p : pro) {
			sum += p.price;
		}
		return sum;
	}
}
