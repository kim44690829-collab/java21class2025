package diExample06;

public class Latte extends Espresso implements Drink {
	String name;
	String way1; 
	
	public Latte() {}
	
	public Latte(String name, String way1) {
		this.name = name;
		this.way1 = way1;
	}

	@Override
	public String drink() {
		return name + super.way + way1;
	}

}
