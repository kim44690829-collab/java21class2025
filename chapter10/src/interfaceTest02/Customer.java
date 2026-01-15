package interfaceTest02;

// 인터페이스는 동시에 두개 이상 implements 가능
public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}
	
	// Buy, Sell 의 디폴트 메서드의 이름이 같은 경우 상속받는 하위 클래스는 반드시 재정의 해아한다.
	@Override
	public void order() {
		System.out.println("고객의 판매 주문");
	}
	
}
