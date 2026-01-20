package diExample;

public class MyCal {
	// 모듈화
	// 1단계 : 계산하는 클래스를 만들었음
	// 2단계 : 위의 클래스를 모듈화
	// 3단계 : 위의 모듈화로 분화한 클래스들의 공통 부분을 인터페이스로 통합
	// 4단계 : DI (의존성 주입) => 의존성 객체 주입
	
	// 메서드 하나로 모든 계산을 할 수 있어야함
	public void calc(int num1, int num2, Ical ical) {
		int result = ical.doOper(num1, num2);
		System.out.println(result);
	}
	
	// 더하기 빼기 곱하기 나누기 메서드
//	public void add(int num1, int num2, Ical ical) {
//		// Ical ical => Ical 이라는 데이터 타입으로 구현된 객체를 메서드 안에서 사용할 수 있도록 한다.
//		// Add ad = new Add();
//		// 인터페이스는 객체화는 불가능하지만 데이터 타입으로는 사용할 수 있다.
//		// 인터페이스 자체가 데이터 타입을 상속하기 때문에
//		//Ical ical = new Add();
//		int result = ical.doOper(num1, num2);
//		System.out.println(result);
//	}
//	public void sub(int num1, int num2, Ical ical) {
////		Sub sb = new Sub();
////		Ical ical = new Sub();
//		int result = ical.doOper(num1, num2);
//		System.out.println(result);
//	}
//	public void mul(int num1, int num2, Ical ical) {
////		Mul mu = new Mul();
////		Ical ical = new Mul();
//		int result = ical.doOper(num1, num2);
//		System.out.println(result);
//	}
//	public void div(int num1, int num2, Ical ical) {
////		Div dv = new Div();
////		Ical ical = new Div();
//		int result = ical.doOper(num1, num2);
//		System.out.println(result);
//	}
}