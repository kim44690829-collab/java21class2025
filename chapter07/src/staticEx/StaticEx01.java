package staticEx;

public class StaticEx01 {
	// static : 데이터 메모리 영역에서 값 공유
	static int atm = 0;
	
	String name;
	// int money;
	
	public StaticEx01() {};
	
	// 위의 디폴트 생성자를 오버로딩 => 재정의함 => 매개변수를 입력해야함
	public StaticEx01(String name) {
		this.name = name;
	};
	
	// 입금
	public void sMoney(int money) {
		atm += money;
		System.out.println("atm : " + atm);
	}
	
	// 출금
	public void spendMoney(int money) {
		atm -= money;
		System.out.println("atm : " + atm);
	}
	
	// 출력
	public void getBankInfo() {
		System.out.println("name : " + this.name);
		System.out.println("atm : " + atm);
	}
}
