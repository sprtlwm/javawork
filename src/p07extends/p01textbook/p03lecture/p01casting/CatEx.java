package p07extends.p01textbook.p03lecture.p01casting;

public class CatEx {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.walk();
		
		Cat c1 = (Cat) a1; //casting - 강제 영변환
		c1.punch();
		c1.punch();
		
	}
}
