package diExample06;

public class OrangeJuice implements Drink {
	String way1; 
	String way2; 
	
	public OrangeJuice() {}
	
	public OrangeJuice(String way1, String way2) {
		this.way1 = way1;
		this.way2 = way2;
	}

	@Override
	public String drink() {
		return "오렌지 주스를 제조합니다 - " + way1 + " → " + way2;
	}
	
	
}
