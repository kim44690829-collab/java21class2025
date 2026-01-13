package inheritance02;

public class ColorTv extends TV {
	
	protected int color;

	public ColorTv() {};

	public ColorTv(int size, int color) {
		this.color = color;
		super.size = size;
		// size = size;
	};
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	// size는 부모 클래스인 tv에 멤버변수
	public void printProperty() {
		System.out.println(size + "인치 " + color + "컬러");
	}
	
}
