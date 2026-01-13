package inheritance;

// 부모 클래스인 parentClass를 자식 클래스인 ChildClass에 상속
// 상속 키워드 : extends
// 사용 방법 : 자식 클래스 이름 extends 부모 클래스이름
public class ChildClass extends ParentClass {
	// 자식 클래스
	int a = 5;
	int b = 6;
	
	// 디폴트 생성자
	public ChildClass() {
		// super(); // 부모의 디폴트 생성자를 호출 => 생략해도 컴파일러가 자동으로 추가해줌 => 생략 가능
		System.out.println("ChildClass 생성자");
		super.setA(30);
	};
	
	// 메서드
	public void childFun() {
		// this => 현재 ChildClass / super => 부모 ParentClass
		this.a = 12;
		
		// 부모의 멤버변수 a에 접근해서 값을 25로 변경
		// super.a = 25;
		
		System.out.println("== child start ==");
		System.out.println("자식의 a : " + a + ", 부모의 a : " + super.a);
		
	}
	
}
