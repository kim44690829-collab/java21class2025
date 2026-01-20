package diExample05;

public class Triangel implements ShapeCalc {

	int tri1; // 밑변
	int tri2; // 높이
	
	public Triangel() {}
	
	public Triangel(int tri1, int tri2) {
		this.tri1 = tri1;
		this.tri2 = tri2;
	}	
	
	@Override
	public String shape(String sha) {
		double shapeTri = (double)(tri1 * tri2) / 2;
		return sha + "의 면적 : " + shapeTri;
	}


}
