package setget;

public class HomeAgency implements Rentable<TV>{

	@Override
	public TV rent() {
		return new TV();
	}
	
	
}


