package polymorphism;

public class Tiger extends Animal {

	@Override // 오버라이딩이 되면 가상메서드에 저장되는데 그 재정의되었다고 알려주는 역할
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}
