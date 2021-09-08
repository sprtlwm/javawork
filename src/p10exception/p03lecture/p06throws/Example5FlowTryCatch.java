package p10exception.p03lecture.p06throws;

public class Example5FlowTryCatch {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	
	
	public static void method1() throws Exception {
		
		throw new Exception();
		
	}
}
