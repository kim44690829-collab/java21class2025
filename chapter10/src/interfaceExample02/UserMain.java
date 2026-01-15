package interfaceExample02;

public class UserMain {

	public static void main(String[] args) {
		
		Animal cat = new Cat();
		Animal chicken = new Chicken();
		Animal monkey = new Monkey();
		
		cat.eat("생선을");
		monkey.eat("과일을");
		chicken.eat("사료");
		System.out.println();
		
		cat.work("네발로");
		monkey.work("네발 또는 두발로");
		chicken.work("두발로");
		System.out.println();
		
		cat.sleep("엎드려서");
		monkey.sleep("누워서");
		chicken.sleep("서서");
		
		
		
		

	}

}
