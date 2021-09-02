package p07extends.p01textbook.p03lecture.p01casting;

public class InstanceOfEx {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		
		System.out.println(a1 instanceof Animal); //t
		System.out.println(a1 instanceof Dog); 	  //f
		System.out.println(a1 instanceof Cat);	  //f
		
		System.out.println(c1 instanceof Cat);    //t
		System.out.println(c1 instanceof Animal); //t
//		System.out.println(c1 instanceof Dog);    // compile error
		
		System.out.println(d1 instanceof Dog);    //t
		System.out.println(d1 instanceof Animal); //t
//		System.out.println(d1 instanceof Cat); 	  // compile error
		
	}
}
