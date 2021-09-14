package p12thread.p03lecture.p03sync;

public class Ex02 {

	public static int value = 0;
	
	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i <10000; i++) {
					value++;
				//value 읽기
				//value 증가
				//value 쓰기	
				}
			}		
		};
		
		Thread t1 = new Thread(r); 
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(value);
		
	}
}
