package inheritance03;

public class FounctionPen extends BollPen {
	
	public FounctionPen() {};
	
	public FounctionPen(String name, int residual, int thickness, String color) {
		super.name = name;
		super.residual = residual;
		super.thickness = thickness;
		super.color = color;
	};
	
	@Override
	public void printP() {
		super.printP();
	}
}
