package p08interface.p01textbook;

public class RemoteControlEx3DefaultMethod {

	public static void main(String[] args) {
		
		Audio a1 = new Audio();
		Television t1 = new Television();
		SmartTelevision s1 = new SmartTelevision();
		
		a1.setMute(true);
		t1.setMute(false);
		s1.setMute(true);
		
	}
}
