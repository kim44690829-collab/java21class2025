package diExample03;

public class CreditCardPayment implements Payment {

	@Override
	public String payment(String paymeans, int pay) {
		return paymeans + "로 " + pay + "원 결제 완료";
	}
	
}
