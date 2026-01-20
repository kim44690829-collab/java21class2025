package diExample03;

public class PaymentProcessor {

	public void payProcessor(String paymeans, int pay, Payment pa ) {
		String msg = pa.payment(paymeans, pay);
		System.out.println(msg);
	}
}
