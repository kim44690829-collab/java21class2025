package diExample07;

public class DiscountCalculator {

	public void applyDiscount(Discount disC) {
		String msg = disC.discount();
		System.out.println(msg);
	}
}
