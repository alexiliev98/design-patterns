import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChatMessageMediator implements MessageMediator {

	private List<User> users;
	private GuardBot guardBot;

	public ChatMessageMediator() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User sender) {
		if (!users.contains(sender)) {
			return;
		}

		System.out.println(sender.nickname + " sends message: " + message);  

		if (message.equals(SpecialChatMessages.BOT_CREATION_MESSAGE)) {
			guardBot = GuardBot.getInstance();
			System.out.println("Bot created.");
		}

		List<User> receivers = users.stream().filter(user -> user != sender).collect(Collectors.toList());
		receivers.forEach(receiver -> {
			receiver.receiveMessage(message);
		});

		if (guardBot != null && !guardBot.verifyMessage(message)) {
			removeUser(sender);
			System.out.println(sender.nickname + " removed from chat due to using the forbidden word: "
					+ SpecialChatMessages.FORBIDDEN_WORD);
			guardBot.notifyUsers(users);
		}

	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void removeUser(User user) {
		this.users.remove(user);
	}

}
