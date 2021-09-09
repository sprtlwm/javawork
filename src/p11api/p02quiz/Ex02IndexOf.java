package p11api.p02quiz;

public class Ex02IndexOf {
	public static void main(String[] args) {
		
		String str = "간장 공장 공장장은 강 공장장이고 된장 공장 공장장은 공 공장장이다.";
		
		//"공장"이 있는 index들을 출력
		//6개의 인덱스가 출력되어야 한다.
		
//		System.out.println(str.indexOf("공장"));
//		System.out.println(str.indexOf("공장", 4));
//		System.out.println(str.indexOf("공장", 7));
//		System.out.println(str.lastIndexOf("공장", 24));
//		System.out.println(str.lastIndexOf("공장", 31));
//		System.out.println(str.lastIndexOf("공장"));
		
		String s = "공장";
		
		int i = 0 - s.length();
		
		boolean run = true;
		while (run) {
			i = str.indexOf(s, i+s.length());
					
			if(i == -1) {
			break;
			}
				System.out.println(i);	
		}
		
		
		
	}
}
