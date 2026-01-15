package abstractTest;

// 추상 클래스는 반드시 abstract 키워드를 입력한다. 
public abstract class Computer {
	
	// 추상 클래스 작성 이유
	// - 어떻게 구현해야할지 구체적인 방법을 모르기때문에 => 각 하위 클래스에서 가져다가 알아서 구현하도록 한다.
	// 추상 클래스는 구현은 하지않고 선언만 하는 메서드를 작성한다. => add(){}에서 코드를 구현하는 부분인 {}를 뺀 상태를 말한다.
	// public abstract display(){}에서 코드를 구현하는 부분인 {}를 body라고 부름.
	
	public abstract void display();
	public abstract void typing();
	
	// 모두 공통으로 구현해야하는 경우는 메서드로 작성한다. 추상클래스가 아니므로 body가 존재해야한다.
	public void turnOn() {
		System.out.println("전원 ON");
	}
	
	public void turnOff() {
		System.out.println("전원 OFF");
	}
}
