import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {

	private List<Observer> observers = new ArrayList<Observer>();
	private String position;

	public Trainee(String position) {
		this.position = position;
	}

	public void setPosition(String position) {
		this.position = position;
		notifyObservers();
	}

	@Override
	public void addViewer(Observer observer) {
		observers.add(observer);
		observer.setTrainee(this);
	}

	@Override
	public void removeViewer(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return position;
	}

	public void standUp() {
		System.out.println("<<Trainee standing up.>>");
		setPosition("Standing");
	}

	public void lieDown() {
		System.out.println("<<Trainee lying down.>>");
		setPosition("Lying");
	}

}
