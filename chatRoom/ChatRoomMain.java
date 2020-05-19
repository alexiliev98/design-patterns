
public class ChatRoomMain {

	public static void main(String[] args) {
		MessageMediator mediator = new ChatMessageMediator();
		UserFactory userFactory = FactoryProducer.getUserFactory();

		User user1 = userFactory.getUser(mediator, "peter");
		User user2 = userFactory.getUser(mediator, "ivan");
		User user3 = userFactory.getUser(mediator, "georgi");

		user1.sendMessage("Hello, everyone!");
		System.out.println();

		// No bot exists yet so the user is not removed
		user2.sendMessage("cat");
		System.out.println();

		user3.sendMessage("addBot");
		System.out.println();

		user2.sendMessage("caT");
		System.out.println();

		user1.sendMessage("goodbye");

		// But he's removed
		user2.sendMessage("blah");

	}

}
