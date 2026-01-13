package inheritance02;

public class IPTV extends ColorTv{
	
	protected String ip;

	public IPTV() {};

	public IPTV(String ip, int size, int color) {
		this.ip = ip;
		super.size = size;
		super.color = color;
	};
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	// @ => 어노테이션 , Override => 재 정의하다.
	@Override 
	
//	public void printProperty() {
//		System.out.println("나의 IPTV는 " + this.ip + "주소의 " + super.size + "인치 " + super.color + "컬러");
//	}
	public void printProperty() {
		System.out.print("나의 IPTV는 " + this.ip + " 주소의 ");
		super.printProperty();
	}
	
}
