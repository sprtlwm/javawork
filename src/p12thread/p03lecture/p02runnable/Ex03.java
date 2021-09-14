package p12thread.p03lecture.p02runnable;

import java.awt.Toolkit;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			 public void run() {
				 for(int i = 0; i<5; i++) {
					 System.out.println(i);
					 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }
			 }
		 };
		 
		 Runnable r2 = new Runnable() {
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
			public void run() {
				for(int i = 0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			 
		 };
		 
		 Thread t1 = new Thread(r1);
		 t1.start();// 숫자가 1초에 한번씩 출력
		 Thread t2 = new Thread(r2);
		 t2.start();//띵링 소리가 1초에 한번씩 다섯번 출력
	}
}