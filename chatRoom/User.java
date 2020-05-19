
public abstract class User {

	protected MessageMediator messageMediator; 
	protected String nickname; 

	public User(MessageMediator messageMediator, String nickname) {
		this.messageMediator = messageMediator;
		this.nickname = nickname;
	}

	public abstract void sendMessage(String message);

	public abstract void receiveMessage(String message);

}
