
public class ChatUser extends User {

	public ChatUser(MessageMediator messageMediator, String name) {
		super(messageMediator, name);
		messageMediator.addUser(this);
	}

	@Override
	public void sendMessage(String message) {
		messageMediator.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(nickname + " receives message: " + message);
	}

}
