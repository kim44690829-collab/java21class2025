package dlExample02;

public class JapaneseGreeting implements Greeting {

	@Override
	public String greeting(String name) {
		return "こんにちは, " + name + "さん!";
	}

}
