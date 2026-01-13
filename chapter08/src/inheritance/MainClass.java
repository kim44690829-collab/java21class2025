package inheritance;

public class MainClass {

	public static void main(String[] args) {
		// 부모 클래스, 자식 클래스 모두 객체화
		ParentClass p = new ParentClass();
		ChildClass c = new ChildClass();
		
		// 부모 클래스의 기본 생성자는 자식 클래스보다 먼저 컴파일러가 불러온다.
		// 없으면 자동으로 생성해준다.
		// 단, 부모의 디폴트 생성자가 존재하지 않는경우 컴파일러는 자동생성 할 수 없다.
		c.childFun();
		
		// c.parentFun 메서드를 접근할 수 있는 이유는 ChildClass가 ParentClass를 상속받았기 때문이다
		c.parentFun();
		
		// main() 메서드에서 자식의 객체를 통해서 변경된 a값을 출력할 수 있고 부모 객체를 새로 생성해서는 그 변경된 값을 볼 수 없다.
		// 부모 객체를 따로 생성하였기 때문에 a = 10이 된다.
		p.parentFun();
		
		System.out.println(c.a);
		System.out.println(c.b);
	}

}
