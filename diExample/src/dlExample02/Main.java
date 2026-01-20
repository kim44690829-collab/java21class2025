package dlExample02;

public class Main {

	public static void main(String[] args) {
		
		GreetingService greetService = new GreetingService();
		
		greetService.greet("홍길동", new KoreanGreeting());
		greetService.greet("홍길동", new EnglishGreeting());
		greetService.greet("홍길동", new JapaneseGreeting());

	}

}
