
public abstract class Employee implements Observable {

	public static final int CITY = 1;
	public static final int COUNTRY = 2;
	public static final int ABROAD = 3;

	protected int level;
	protected Employee nextEmployee;
	protected State state;
	protected Observer parcelBoy;

	public Employee(State state, Observer observer) {
		setState(state);
		addObserver(observer);
	}

	public void setNextEmployee(Employee nextEmployee) {
		this.nextEmployee = nextEmployee;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void checkParcel(int level, String parcel) {

		if (this.level == level) {
			printState();
			acceptParcel(parcel);
			setState(new PreparationState());
			printState();
			notifyObserver(parcel);
			setState(new WaitingState());
			printState();
			return;
		}

		if (this.nextEmployee != null) {
			this.nextEmployee.checkParcel(level, parcel);
		}

	}

	@Override
	public void addObserver(Observer observer) {
		this.parcelBoy = observer;
	}

	@Override
	public void notifyObserver(String parcel) {
		parcelBoy.handleParcel(this, parcel);
	}

	public abstract void printState();

	protected abstract void acceptParcel(String parcel);

	protected abstract String getEmployeeType();

}
