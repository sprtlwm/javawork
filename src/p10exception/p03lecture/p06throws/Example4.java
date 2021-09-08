package p10exception.p03lecture.p06throws;

public class Example4 {

	public static void main(String[] args) throws Exception {
	
		System.out.println("프로구램 시작");
		
		method01();
	
		System.out.println("프로그램 종료");	
	}
		
	
	public static void method01() throws Exception {
		System.out.println("메소드1 시작");
		method02();
		System.out.println("메소드1 종료");
	}
	
	public static void method02() throws Exception {
		System.out.println("메소드2 시작");
		
		throw new Exception();
		
//		System.out.println("메소드2 종료");
	}
}
