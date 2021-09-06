package p08interface.p01textbook.s080502;

public class CarEx {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car yourCar = new Car();
		
		myCar.run();
		
		myCar.frountLfTire = new KumhoTire();
		myCar.frountRhTire = new KumhoTire();
		
		myCar.run();
		yourCar.run();
		
	}
}
