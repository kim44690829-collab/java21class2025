package diExample05;

public class Main {

	public static void main(String[] args) {

		ShapeCalculator sh = new ShapeCalculator();
		
		sh.calculate("원", new Circle(5));
		sh.calculate("사각형", new Rectangle(5, 5));
		sh.calculate("삼각형", new Triangel(5, 5));

	}

}
