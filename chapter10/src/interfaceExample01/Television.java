package interfaceExample01;

public class Television implements Buyable {

	String name = "텔레비전";
	String model;
	String maker;
	int price;
	
	public Television() {};
	public Television(String model, String maker, int price) {
		this.model = model;
		this.maker = maker;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return "---- " + name + " 정보 ----";
		// return name;
	}

	@Override
	public int getPrice() {
		System.out.print("금액 : ");
		return price;
		// return price;
	}

	@Override
	public String getModel() {
		return "모델명 : " + model;
		// return model;
	}

	@Override
	public String getMaker() {
		return "메이커 : " + maker;
		// return maker;
	}
	

}
