package diExample07;

public class PercentDiscount implements Discount {

	int price;
	double discount;
	
	public PercentDiscount() {}
	
	public PercentDiscount(int price, double discount) {
		this.price = price;
		this.discount = discount;
	}
	
	@Override
	public String discount() {
		int discountPrice = (int) (price - (price * discount)); 
		return "원가 : " + price + "원, 할인가 : " + discountPrice + "원";
	}

}
