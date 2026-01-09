package arrayListEx01;

import java.util.*;

public class CartMain {

	public static void main(String[] args) {
		// UI
		Scanner scan = new Scanner(System.in);
		Cart cart = new Cart();
		
		// 기본 장바구니 상품 목록 추가
		// ArrayList<Product> pro = new ArrayList<>(); => 여기에 add를 한거임
		// 현재 heap에 담겨있는 상품
		// ------------------
		// | item  : 사과    |
		// | price : 1000   |
		// ------------------
		cart.addProduct(new Product("사과", 1000));
		cart.addProduct(new Product("바나나", 2000));
		cart.addProduct(new Product("망고", 5000));
		cart.addProduct(new Product("포도", 8000));
		cart.addProduct(new Product("수박", 10000));
		
		System.out.println("[장바구니 목록]");
		cart.showItem();
		System.out.println("총 금액 : " + cart.totalPrice() + "원");
		System.out.println("-------------------------------");
		
		System.out.print("삭제할 상품을 입력하세요 : ");
		int index = scan.nextInt() - 1;
		cart.removeProduct(index);
		System.out.println("[삭제한 후 장바구니 목록]");
		cart.showItem();
		System.out.println("-------------------------------");
		
		System.out.print("추가할 상품을 입력하세요 : ");
		String plus = scan.next();
		cart.addProduct(new Product(plus, 3000));
		System.out.println("[추가한 후 장바구니 목록]");
		cart.showItem();
		System.out.println("-------------------------------");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
