package p07extends.p01textbook.s070804;

public class Example {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		
		d1.sound();
		c1.sound();
	
		System.out.println("-----------------");
	
		//변수의 자동 타입변환
		Animal a1 = null;
		
		a1 = new Dog();
		a1.sound();
		
		a1 = new Cat();
		a1.sound();
		System.out.println("==================");
		
		//메소드의 다형성
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal a1) {
		a1.sound();
	}
	
	
}
