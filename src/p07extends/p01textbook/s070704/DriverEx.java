package p07extends.p01textbook.s070704;

public class DriverEx {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Vehicle v1 = new Vehicle();
		Bus v2 = new Bus();
		Taxi v3 = new Taxi();
		
		driver.driver(v1);
		driver.driver(v2);
		driver.driver(v3);
		
	}
}
