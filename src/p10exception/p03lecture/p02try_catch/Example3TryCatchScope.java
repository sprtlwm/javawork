package p10exception.p03lecture.p02try_catch;

public class Example3TryCatchScope {
	public static void main(String[] args) {
		System.out.println("프로그램시작");
		
		String str = "100";
		
		int n = 0;
		
		try {
			n = Integer.parseInt(str);
//			System.out.println(n * 2);
		}catch(NumberFormatException e) {
			System.out.println("넘버포맷익셉션 발생");
		}
		System.out.println(n * 2);
		System.out.println("프로그램 종료");
		
	}
}
