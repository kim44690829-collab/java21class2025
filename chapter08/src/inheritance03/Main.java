package inheritance03;

public class Main {

	public static void main(String[] args) {
		
		ShapPencil sPencil = new ShapPencil("ShapPencil", 10, 1);
		BollPen bPen = new BollPen("BollPen", 25, 2, "black");
		FounctionPen fPen = new FounctionPen("FounctionPen", 15, 2, "blue");
		
		sPencil.printP();
		System.out.println();
		bPen.printP();
		fPen.printP();

	}

}
