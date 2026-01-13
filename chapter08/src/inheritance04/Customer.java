package inheritance04;

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade = "SILVER";
	protected int bonusPoint;
	protected double bonusRatio = 0.01;
	
	
	public Customer() {};
	// public Customer() {
		// customerGrade = "SILVER";
		// bonusRatio = 0.01;
	// };
	
	public Customer(String customerName) {
		this.customerName = customerName;
		//this.customerGrade = customerGrade;
	};
	
	public void calcPrice(int price) {
		System.out.print("지불 금액은 " + price + "원 이고, ");
		bonusPoint += (int) (price * bonusRatio);
	}
	
	public void showCustomerInfo() {
		System.out.print(customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}
	
//	public int getCustomerId() {
//		return customerId;
//	}
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}
//	public String getCustomerName() {
//		return customerName;
//	}
//	public void setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}
//	public String getCustomerGrade() {
//		return customerGrade;
//	}
//	public void setCustomerGrade(String customerGrade) {
//		this.customerGrade = customerGrade;
//	}
//	public int getBonusPoint() {
//		return bonusPoint;
//	}
//	public void setBonusPoint(int bonusPoint) {
//		this.bonusPoint = bonusPoint;
//	}
//	public int getBonusRatio() {
//		return bonusRatio;
//	}
//	public void setBonusRatio(int bonusRatio) {
//		this.bonusRatio = bonusRatio;
//	}
}
