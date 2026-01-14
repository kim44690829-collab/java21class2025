package inheritance04;

public class GoldCustomer extends Customer {

	double salePoint;//할인율
	
	public GoldCustomer() {};
	
	public GoldCustomer(int customerID, String customerName ) {
//		super(customerID, customerName);
//		customerGread = "GOLD";
		bonusRatio = 0.02;
		this.salePoint = 0.05;
	};
	
	
}
