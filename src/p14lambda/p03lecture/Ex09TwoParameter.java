package p14lambda.p03lecture;

public class Ex09TwoParameter {
	public static void main(String[] args) {
		MyInterface9 o1 =(int a, int b)-> { System.out.println(a+ " " + b);};
		o1.method(3, 4);
		
		MyInterface9 o2 = (a, b) -> System.out.println(a+ " "+b);
		o2.method(5,6);
	}
}

	interface MyInterface9 {
		void method(int a, int b);
	}