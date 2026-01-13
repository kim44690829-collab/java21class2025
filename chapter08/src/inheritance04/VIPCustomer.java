package inheritance04;

public class VIPCustomer extends Customer {

	protected int infoCall;
	
	public VIPCustomer() {};
	
	public VIPCustomer(String customerName, String customerGrade, double bonusRatio, int infoCall) {
		super.customerName = customerName;
		super.customerGrade = customerGrade;
		super.bonusRatio = bonusRatio;
		this.infoCall = infoCall;
	};
	
	public void VIPPoint() {
		if(customerGrade == "VIP") {
			super.bonusRatio = 0.05;
		}
	}
	
	@Override
	public void calcPrice(int price) {
		System.out.print("지불 금액은 " + (int)(price - (price * 0.1)) + "원 이고, ");
		bonusPoint += (int) (price * bonusRatio);
	}
	
	
	
	@Override
	public void showCustomerInfo() {
		super.showCustomerInfo();
		System.out.println(" 그리고 " + super.customerName + "님의" + " 담당 전문 상담원의 전화번호는 " + infoCall + "번 입니다.");
	}
}
