package diExample;

public class Main {

	public static void main(String[] args) {
		
		MyCal mycal = new MyCal();
		
		mycal.calc(20, 10, new Add());
		mycal.calc(20, 10, new Sub());
		mycal.calc(20, 10, new Mul());
		mycal.calc(20, 10, new Div());
	}

}
