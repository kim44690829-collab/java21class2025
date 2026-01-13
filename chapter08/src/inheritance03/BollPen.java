package inheritance03;

public class BollPen extends ShapPencil {
	
	protected String color;
	
	public BollPen() {};
	
	public BollPen(String name, int residual, int thickness, String color) {
		super.name = name;
		super.residual = residual;
		super.thickness = thickness;
		this.color = color;
	};

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void printP() {
		super.printP();
		System.out.println(", 색상 : " + color);
	}
	
}
