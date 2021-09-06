package p07extends.p01textbook.s070804;

public class Cat extends Animal{

	//상위클래스가 추상메소드를 가지고 있다면
	//하위클래스가 실체클래스일 때
	//추상메소드에 대한 재정의(오버라이딩)을 해야합니다.
	
	
	public Cat() {
		this.kind ="포유류";
	}
	
	public void sound(){
		System.out.println("야옹");
	}
}
