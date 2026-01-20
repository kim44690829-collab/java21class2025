package diExample04;

public class SmsMessage implements Message {

	@Override
	public String message(String name, String msg, String msgmeans) {
		return name + "에게 " + msg + "를 " + msgmeans + "로 전송";
	}
	
}
