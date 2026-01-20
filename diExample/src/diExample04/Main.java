package diExample04;

public class Main {

	public static void main(String[] args) {

		MessageSender msgSend = new MessageSender();
		
		msgSend.sendMessage("홍길동", "안녕하세요", "SMS", new SmsMessage());
		msgSend.sendMessage("홍길동", "안녕하십니까", "Email", new EmailMessage());
		msgSend.sendMessage("홍길동", "안녕하셨어요", "kakao", new KakaoMessage());

	}

}
