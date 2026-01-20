package diExample06;

public class GreenTea implements Drink {
	String way1; 
	String way2;
	
	public GreenTea() {}
	
	public GreenTea(String way1, String way2) {
		this.way1 = way1;
		this.way2 = way2;
	}

	@Override
	public String drink() {
		return "그린티를 제조합니다 - " + way1 + " → " + way2;
	}
	
}
