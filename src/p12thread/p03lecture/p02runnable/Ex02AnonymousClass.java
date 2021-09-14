package p12thread.p03lecture.p02runnable;

public class Ex02AnonymousClass {
	public static void main(String[] args) {
		
//		Thread t1 = new Thread(new Runnable(){
//
//			public void run() {}
//			});

		MyInterface o1 = new MyClass();
		o1.method1();
		
		MyInterface o2 = new MyInterface() {

			public void method1() {
				System.out.println("무명클래스 매소드 정의");
			}
		};
		o2.method1();
	}
}

interface MyInterface{
	
	void method1();
	
}

class MyClass implements MyInterface{

	@Override
	public void method1() {
		System.out.println("메소드 재정의");
		
	}
	
}
