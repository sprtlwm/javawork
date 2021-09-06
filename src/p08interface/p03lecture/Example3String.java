package p08interface.p03lecture;

import java.io.Serializable;

public class Example3String {

	public static void main(String[] args) {
		
		String str = "java";
		
		System.out.println(str instanceof String);
		System.out.println(str instanceof Object);
		System.out.println(str instanceof Serializable);
		System.out.println(str instanceof CharSequence);
		System.out.println(str instanceof Comparable<?>);
		
		CharSequence cs = "spring";
		System.out.println(cs.length());
	}
}
