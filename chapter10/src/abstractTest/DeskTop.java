package abstractTest;

// 추상 클래스를 extends로 상속 받는다.
public class DeskTop extends Computer {

	@Override // 부모 메서드를 상속받아 재정의한다.
	public void display() {
		System.out.println("DeskTop display() --- ");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing() --- ");
		
	}
	
	
	
}
