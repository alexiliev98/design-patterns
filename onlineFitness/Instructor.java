
public class Instructor {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void giveInstruction() {
		System.out.print("Giving instruction: ");
		command.execute();
	}

}
