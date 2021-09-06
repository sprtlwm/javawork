package p08interface.p01textbook.s080502;

public class Car {

	Tire frountLfTire = new HankookTire();
	Tire frountRhTire = new HankookTire();
	Tire backLfTire = new HankookTire();
	Tire backRhTire = new HankookTire();
	
	void run() {
		frountLfTire.roll();
		frountRhTire.roll();
		backLfTire.roll();
		backRhTire.roll();
	}
	
}
