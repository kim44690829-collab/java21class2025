package polymorphism;

public class AnimalTest {

	
	public static void main(String[] args) {
			
		AnimalTest ates = new AnimalTest();
		ates.moveAnimal(new Hauman());
		ates.moveAnimal(new Tiger());
		ates.moveAnimal(new Eagle());

	}
	// 데이터 타입이 Animal
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
