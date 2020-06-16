
public interface Observable {

	void addObserver(Observer observer);

	void notifyObserver(String parcel);

}
