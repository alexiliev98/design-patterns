
public class UserFactory {

	public User getUser(MessageMediator messageMediator, String nickname) {
		return new ChatUser(messageMediator, nickname);  
	} 
	
}
