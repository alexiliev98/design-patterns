
public interface Observable {

	public void addViewer(Observer observer);

	public void removeViewer(Observer observer);

	public void notifyObservers();

	public String getUpdate();

}
