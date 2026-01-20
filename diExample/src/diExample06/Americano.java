package diExample06;

public class Americano extends Espresso implements Drink {
	String name;
	String way1;
	
	public Americano() {}
	
	public Americano(String name, String way1) {
		this.name = name;
		this.way1 = way1;
	}
	
	@Override
	public String drink() {
		return name + super.way + way1;
	}

}
