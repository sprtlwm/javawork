package p10exception.p03lecture.p05throw;

public class Example3 {

	public static void main(String[] args) {
		
		//실행예외(unchecked exception)
		//Exception 중에 RuntimeException울 상속 받은것
		
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("익셉션 발생");
		}
	
			
		//일반예외(checked exception)
		//Exception 중 RuntimeException울 상속 받지 않은 것
	
		throw new RuntimeException();
	}
}
