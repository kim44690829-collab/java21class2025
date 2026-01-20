package diExample04;

public class MessageSender {
	public void sendMessage(String name, String msg, String msgmeans, Message me) {
		String msgs = me.message(name, msg, msgmeans);
		System.out.println(msgs);
	}
}
