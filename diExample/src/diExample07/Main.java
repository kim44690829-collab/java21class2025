package diExample07;

public class Main {

	public static void main(String[] args) {

		DiscountCalculator di = new DiscountCalculator();
		
		di.applyDiscount(new PercentDiscount(60000, 0.2));
		di.applyDiscount(new FixedDiscount(70000, 5000));
		di.applyDiscount(new NoDiscount(50000));

	}

}
