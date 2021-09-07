package p08interface.p03lecture.p06anonymous_class;

public class Exapmle1 {
	public static void main(String[] args) {
//		MyInterface1 i = new MtInterface1(); //X
		MyInterface1 i2 = new MyClass1();
		
		//클래스와 인스터스(객체)를 한 번에 만들 수 있음
		MyInterface1 i3 = new MyInterface1() { 
			
		}; //O
	}
}
