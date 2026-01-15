package interfaceExample03;

public class Main {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		
		circle.redraw();
		System.out.println("면적은 " + circle.getArea());
		
	}

}
