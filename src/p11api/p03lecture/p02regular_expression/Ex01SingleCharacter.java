package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex01SingleCharacter {
	public static void main(String[] args) {
		
		String s1 = "a"; //string
		String p1 = "a"; //pattern
		
		boolean b1 = Pattern.matches(p1, s1); //true
		
		System.out.println(b1);
		
		System.out.println(Pattern.matches(p1, "b")); //false
		System.out.println(Pattern.matches(p1, "c")); //false
		System.out.println(Pattern.matches(p1, "aa")); //false
	
		System.out.println("=================");
		
		String p2 = "b";
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "b"));
		System.out.println(Pattern.matches(p2, "bb"));
		System.out.println(Pattern.matches(p2, "B"));
	}
}
