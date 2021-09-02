package p07extends.p01textbook.p03lecture.p01casting;

public class DogEx {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		
		a1.walk();
		
		Cat c1 = (Cat)a1;
		c1.punch();
		System.out.println("프로그램 정상종료");
}
}
