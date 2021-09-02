package p07extends.p01textbook;

class A{}

class B extends A{}//B는 A다
class C extends A{}//C는 A다

class D extends B{}//D는 B다, D는 A다
class E extends C{}//E는 C다, E는 A다


public class PromotionEx {
	
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		//상속 관계가 있지 않음
		/*
		 * B b3 = e;
		 * C c2 = d;
		 */
	}

}
