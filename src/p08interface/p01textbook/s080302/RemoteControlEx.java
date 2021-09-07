package p08interface.p01textbook.s080302;

import p08interface.p01textbook.RemoteControl;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		
//		rc = new RemoteControl(); // X
		rc = new RemoteControl() {

			@Override
			public void trunOn() {
			System.out.println("메소드구현");
			}

			@Override
			public void trunOff() {
				System.out.println("메소드구현");
				
			}

			@Override
			public void setVolume(int volume) {
			System.out.println("메소드구현");
				
			}
			
		};// O  
	}
}
