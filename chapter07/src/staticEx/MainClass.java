package staticEx;

public class MainClass {

	public static void main(String[] args) {
		
		StaticEx01 stEx01 = new StaticEx01("박찬호");
		stEx01.sMoney(100);
		stEx01.getBankInfo();
		System.out.println(stEx01.atm);
		System.out.println("--------------");
		
		
		StaticEx01 stEx02 = new StaticEx01("이승엽");
		stEx02.sMoney(200);
		stEx02.getBankInfo();
		stEx02.spendMoney(100);
		System.out.println(stEx02.atm);
		System.out.println("--------------");
		
	}

}
