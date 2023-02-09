package setget;

public class HomeAgencyExample {

	public static void main(String[] args) {
		//HomeAgency agency = new HomeAgency();
		Rentable<TV> rentable = new HomeAgency();
		//인터페이스               //구현체로
		TV tv = rentable.rent();
		tv.TurnOn();

	}

}
