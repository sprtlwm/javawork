package p11api.p03lecture.p01string;

public class Ex05LastIndexOf {
	public static void main(String[] args) {
		
		String s1 = "java보다 javascript가 더 쉬웠어요";
		//			 0123 45 678901234567 89 0 1 23 4
										
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.lastIndexOf("java"));
		
		
	}
}
