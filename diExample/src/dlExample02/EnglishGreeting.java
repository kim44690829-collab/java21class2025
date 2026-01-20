package dlExample02;

public class EnglishGreeting implements Greeting {

	@Override
	public String greeting(String name) {
		return "Hello, " + name + "!";
	}

}
