package diExample07;

public class NoDiscount implements Discount {

	int price;
	
	public NoDiscount() {}
	
	public NoDiscount(int price) {
		this.price = price;
	}
	
	@Override
	public String discount() { 
		return "원가 : " + price + "원, 할인가 : 현재 할인을 진행하지 않습니다.";
	}

}
