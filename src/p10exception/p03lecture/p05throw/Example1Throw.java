package p10exception.p03lecture.p05throw;

public class Example1Throw {
	public static void main(String[] args) {
		
		System.out.println("프로그렘 시작");
		
		//RuntimeException을 상속받은 Exception은 try,catch를 사용하지 않아도 된다.
		
		NullPointerException e = new NullPointerException();
	
		throw e;

//		System.out.println("프로그램 종료");	
		
	}
}
