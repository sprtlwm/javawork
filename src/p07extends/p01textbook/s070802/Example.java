package p07extends.p01textbook.s070802;

import p07extends.p03lecture.p01casting.Cat;

public class Example {
	
	public static void main(String[] args) {
	
//		Phone p1 = new Phone();
		Phone p2 = new Telephone();
		Phone p3 = new SmartPhone();
		
		p2.turnOn();
//		p2.autAnswering();
		
		p3.turnOn();
//		p3.internetSearch();
		
		//p2 변수의 값을 이용해서 autoAnswering 실행
		//p3 변수의 값을 이용해서 internetSearch 실행
		
			Telephone t1  = (Telephone) p2;
			t1.autoAnswering();
		//============ 캐스팅 =============//
			SmartPhone s1 = (SmartPhone) p3;
			s1.internetSearch();
		
		//
			System.out.println("====================");
			((Telephone) p2).autoAnswering();
			((SmartPhone)p3).internetSearch();
	}
}
