package p10exception.p02quiz;

public class Example6 {
	// ClassCastException
	public static void main(String[] args) {
		
		String str = "java";
		method(str);
		
	}

	private static void method(Object o) {
		Num n = (Num) o;
		
	}
}
