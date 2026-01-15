package abstractTest;

// 부모 추상클래스인 Computer에서 상속받은 추상 메서드 일부만 구현하고싶다면 반드시 abstract 키워드를 입력하여 추상 클래스임을 명시하여야한다.
public abstract class NoteBook extends Computer{

	@Override
	public void display() {
		System.out.println("NoteBook display() --- ");
	}

}
