package diExample07;

public class FixedDiscount implements Discount {

	int price;
	int discount;
	
	public FixedDiscount() {}
		
	public FixedDiscount(int price, int discount) {
		this.price = price;
		this.discount = discount;
	}
	
	@Override
	public String discount() {
		int discountPrice = price - discount; 
		return "원가 : " + price + "원, 할인가 : " + discountPrice + "원";
	}

}
