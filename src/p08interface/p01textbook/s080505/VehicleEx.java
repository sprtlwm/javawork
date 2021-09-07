package p08interface.p01textbook.s080505;

public class VehicleEx {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		
	}
}
