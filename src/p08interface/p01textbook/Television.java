package p08interface.p01textbook;

public class Television implements RemoteControl {

	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("tv를 켭니다.");
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
