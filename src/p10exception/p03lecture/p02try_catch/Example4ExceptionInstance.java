package p10exception.p03lecture.p02try_catch;

public class Example4ExceptionInstance {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int[] arr = {3,6,2};
		
		try {
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
			System.out.println("메세지:" + e.getMessage());
			System.out.println("원인:" +e.getCause());
		}
			
		
		System.out.println("프로그램 종료");
		
	}
}
