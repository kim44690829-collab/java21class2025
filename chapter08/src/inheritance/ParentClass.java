package inheritance;

public class ParentClass {
	// 부모 클래스
	protected int a = 10;
	protected int b = 20;
	
	// 생성자
	public ParentClass() {
		System.out.println("ParentClass 생성자");
	};
	
	public ParentClass(int a, int b) {
		this.a = a;
		this.b = b;
	};
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	
	
	// 메서드
	public void parentFun() {
		System.out.println("== parentFun ==");
		System.out.println("부모 : " + this.getA() + ", " + b);
	}
}
