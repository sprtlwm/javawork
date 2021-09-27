package p14lambda.p03lecture;

public class Ex01Anonymous {
	public static void main(String[] args) {
		MyInterface1 o1;
		o1 = new MyClass1();
		
		//인터페이스 구현과 객체생성을 한 번에
		
		MyInterface1 o2 = new MyInterface1() {

			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
	}
}

interface MyInterface1{
	public void method1();
}

class MyClass1 implements MyInterface1{

	//인터페이스 구현
	
	//추상메소드 재정의
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
}