package p08interface.p03lecture.p06anonymous_class;

public class Example2 {
	public static void main(String[] args) {
		
		//클래스 작성, 객체 생성 동시
		MyInterface2 i1 = new MyInterface2() {
			
			public void method1() {
				System.out.println("구현 클래스의 메소드1");
			}
		};
		
		i1.method1();
	}
}
