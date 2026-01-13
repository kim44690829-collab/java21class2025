package inheritance04;

public class Main {

	public static void main(String[] args) {
		
		Customer nomalC = new Customer("이성계");
		nomalC.calcPrice(10000);
		nomalC.showCustomerInfo();
		System.out.println();
		
		// Customer VIPC = new VIPCustomer("김길동", "VIP", 0.05, 1010); =>  상속 관계에서는 상위 클래스를 데이터 타입으로 지정하는것이 가능하다.
		VIPCustomer VIPC = new VIPCustomer("김길동", "VIP", 0.05, 1010);
		VIPC.calcPrice(10000);
		VIPC.showCustomerInfo();
		
	}

}
