package diExample03;

public class Main {

	public static void main(String[] args) {
		
		PaymentProcessor pa = new PaymentProcessor();
		
		pa.payProcessor("신용카드", 10000, new CreditCardPayment());
		pa.payProcessor("카카오페이", 10000, new KakaoPayPayment());
		pa.payProcessor("네이버페이", 10000, new NaverPayPayment());
	}

}
