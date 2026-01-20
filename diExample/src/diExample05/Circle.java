package diExample05;

public class Circle implements ShapeCalc{

	int radius;
	
	public Circle() {}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public String shape(String sha) {
		double shapeCir = (radius * radius) * pi;
		return sha + "의 면적 : " + shapeCir;
	}

	

}
