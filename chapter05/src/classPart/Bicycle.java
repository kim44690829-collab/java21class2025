package classPart;

public class Bicycle {
	String color;
	int price;
	
	public Bicycle() {}
	// public Bicycle(){
		// System.out.println("Bicycle constructor - I");
	// }
	
	// public Bicycle(String c, int p){
		// System.out.println("Bicycle constructor - II");
		// color = c;
		// price = p;
	// }
	
	public void showBicycle() {
		System.out.println("-- info --");
		System.out.printf("color : %s%nprice : %d%n", color, price);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Bicycle bi1 = new Bicycle();
		
		Bicycle bi2 = new Bicycle();
		bi2.color = "red";
		bi2.price = 100000;
		

		System.out.println("Bicycle constructor - I");
		bi1.showBicycle();
		
		
		System.out.println("Bicycle constructor - II");
		bi2.showBicycle();
	}
}
