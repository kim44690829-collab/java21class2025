package diExample05;

public class Rectangle implements ShapeCalc {

	int rec1; // 가로
	int rec2; // 세로

	public Rectangle() {}
	
	public Rectangle(int rec1, int rec2) {
		this.rec1 = rec1;
		this.rec2 = rec2;
	}
	
	@Override
	public String shape(String sha) {
		int shapeRec = rec1 * rec2;
		return sha + "의 면적 : " + shapeRec;
	}


}
