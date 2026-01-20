package dlExample02;

public class KoreanGreeting implements Greeting{

	@Override
	public String greeting(String name) {
		return "안녕하세요, " + name + "님";
	}

}
