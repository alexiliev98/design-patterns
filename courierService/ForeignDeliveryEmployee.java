
public class ForeignDeliveryEmployee extends Employee {

	public ForeignDeliveryEmployee(State state, Observer observer) {
		super(state, observer);
		level = Employee.ABROAD;
	}

	@Override
	protected void acceptParcel(String parcel) {
		System.out.println(parcel + " accepted by Foreign Delivery Employee");
	}

	@Override
	public void printState() {
		System.out.println("Foreign Delivery Employee State: " + state.getStateName());
	}

	@Override
	protected String getEmployeeType() {
		return "foreign delivery employee";
	}

}
