
public class CourierServiceMain {

	private static Employee getChain(State state, Observer observer) {
		Employee cityEmployee = new CityDeliveryEmployee(state, observer);
		Employee countryEmployee = new CountryDeliveryEmployee(state, observer);
		Employee foreignEmployee = new ForeignDeliveryEmployee(state, observer);

		cityEmployee.setNextEmployee(countryEmployee);
		countryEmployee.setNextEmployee(foreignEmployee);
		return cityEmployee;
	}

	public static void main(String[] args) {

		State initialState = new WaitingState();
		Observer parcelBoy = new ParcelBoy();

		Employee chain = getChain(initialState, parcelBoy);
		chain.checkParcel(1, "Tax Payment Message");
		System.out.println();
		chain.checkParcel(2, "Letter from bank");
		System.out.println();
		chain.checkParcel(3, "Money");
		System.out.println();
		chain.checkParcel(1, "Toaster Oven");

	}

}
