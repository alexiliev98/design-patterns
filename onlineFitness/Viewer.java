
public class Viewer implements Observer {

	private int id;
	private String position;
	private Observable trainee;

	public Viewer(String position, int id) {
		setPosition(position);
		setId(id); 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public void update() {
		if (trainee == null) {
			System.out.println("No trainee.");
			return;
		}

		String traineePosition = trainee.getUpdate();
		System.out.println("Viewer " + id + ": Position updated from " + getPosition() + " to " + traineePosition);
		setPosition(traineePosition); 
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;
	}

	public Observable getTrainee() {
		return trainee;
	}

}
