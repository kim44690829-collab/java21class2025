package inheritance03;

public class ShapPencil {
	protected String name;
	protected int residual;
	protected int thickness;
	
	public ShapPencil() {};

	public ShapPencil(String name, int residual, int thickness) {
		this.name = name;
		this.residual = residual;
		this.thickness = thickness;
	};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getResidual() {
		return residual;
	}
	public void setResidual(int residual) {
		this.residual = residual;
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	
	public void printP() {
		System.out.print(name + " : 잔여량 : " + residual + ", 펜 굵기 : " + thickness);
	}
	
}
