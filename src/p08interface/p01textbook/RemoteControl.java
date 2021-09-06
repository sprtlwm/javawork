package p08interface.p01textbook;

public interface RemoteControl {

	public int MAX_VOLUME = 10; //public static final 
	public int MIN_VOLUME = 0;           //
	
	public void trunOn();
	public void trunOff();
	public void setVolume(int volume);

	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음");
		}else {
			System.out.println("무음해제");
		}
		
	}
	public static void changeBattery() {
		System.out.println("건전지를 교환 합니다.");
	}
}
