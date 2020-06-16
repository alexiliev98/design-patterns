
public class ParcelBoy implements Observer {

	@Override
	public void handleParcel(Employee employee, String parcel) {
		System.out.println("Parcel boy takes " + parcel + " from " + employee.getEmployeeType());
		System.out.println(parcel + " put in storage by the parcel boy."); 
	}

}
