package interfaceExample01;

public class Refrigerator implements Buyable {
	
	String name = "냉장고";
	String model;
	String denggub;
	int price;

	public Refrigerator(String model, String denggub, int price) {
		this.model = model;
		this.denggub = denggub;
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
		return "효율성등급 : " + denggub;
		// return denggub;
	}

}
