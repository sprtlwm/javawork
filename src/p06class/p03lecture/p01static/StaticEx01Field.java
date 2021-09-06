package p06class.p03lecture.p01static;

public class StaticEx01Field {
	
	public static void main(String[] args) {
		
		Class01.id = 3;
		System.out.println(Class01.id);
		
		Class01 c1 = new Class01();
		Class01 c2 = new Class01();
		
		
	}
}

class Class01{
	//static field
	//정적멤버변수, 정적필드, 스태틱 필드, 스태틱 변수, 정적변수
	//클래스변수
	
	static int id;
}