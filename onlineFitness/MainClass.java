
public class MainClass {

	public static void main(String[] args) {
		Trainee trainee = new Trainee("Standing");

		Observer viewer1 = new Viewer("Standing", 1);
		Observer viewer2 = new Viewer("Standing", 2);
		Observer viewer3 = new Viewer("Standing", 3);

		trainee.addViewer(viewer1);
		trainee.addViewer(viewer2);
		trainee.addViewer(viewer3);

		Instructor instructor = new Instructor();

		Command lieDownCommand = new LieDownCommand(trainee);
		Command standUpCommand = new StandUpCommand(trainee);

		while (true) {
			instructor.setCommand(lieDownCommand);
			instructor.giveInstruction();

			pause();

			instructor.setCommand(standUpCommand);
			instructor.giveInstruction();

			pause();
		}

	}

	private static void pause() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

}
