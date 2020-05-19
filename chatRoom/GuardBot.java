import java.util.List;

public class GuardBot {

	private static GuardBot instance;

	private GuardBot() {

	}

	public static GuardBot getInstance() {
		if (instance == null) {
			instance = new GuardBot();
		}
		return instance;
	}

	public boolean verifyMessage(String message) {
		if (message.equalsIgnoreCase(SpecialChatMessages.FORBIDDEN_WORD)) {
			return false;
		} else {
			return true;
		}
	}

	public void notifyUsers(List<User> users) {
		users.forEach(user -> {
			user.receiveMessage("Warning: \"" + SpecialChatMessages.FORBIDDEN_WORD + "\" is forbidden!");  
		});
	}

}