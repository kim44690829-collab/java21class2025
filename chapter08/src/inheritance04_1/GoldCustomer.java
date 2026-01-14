package inheritance04_1;

public class GoldCustomer extends Customer {

	double salePoint;//할인율
	
	public GoldCustomer() {};
	
	public GoldCustomer(int customerID, String customerName ) {
		super(customerID, customerName);
		customerGread = "GOLD";
		bonusRatio = 0.02;
		this.salePoint = 0.05;
	};
	
	public int calcPrice(int price) {
		//bonusPoint = (int)(bonusPoint)
		// int로 명시적 형변환을 한다. 이유는: 멤버변수에 데이터 타입이 double이기때문
		return price - (int)(price* salePoint);
	}
}
