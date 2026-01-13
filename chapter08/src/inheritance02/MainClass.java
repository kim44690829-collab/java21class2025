package inheritance02;

public class MainClass {

	public static void main(String[] args) {
		
		ColorTv myTv = new ColorTv(32, 1024);
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		
		myTv.printProperty();
		iptv.printProperty();
		
	}

}
