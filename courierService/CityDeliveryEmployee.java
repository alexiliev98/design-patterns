
public class CityDeliveryEmployee extends Employee {

	public CityDeliveryEmployee(State state, Observer observer) {
		super(state, observer);
		level = Employee.CITY;
	}

	@Override
	protected void acceptParcel(String parcel) {
		System.out.println(parcel + " accepted by City Employee");
	}

	@Override
	public void printState() {
		System.out.println("City Employee State: " + state.getStateName());
	}

	@Override
	protected String getEmployeeType() {
		return "city delivery employee"; 
	}

}
