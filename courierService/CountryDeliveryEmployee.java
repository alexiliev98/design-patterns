
public class CountryDeliveryEmployee extends Employee {

	public CountryDeliveryEmployee(State state, Observer observer) {
		super(state, observer);
		level = Employee.COUNTRY;
	}

	@Override
	protected void acceptParcel(String parcel) {
		System.out.println(parcel + " accepted by Country Employee");
	}

	@Override
	public void printState() {
		System.out.println("Country Employee State: " + state.getStateName());
	}

	@Override
	protected String getEmployeeType() {
		return "country delivery employee";
	}

}
