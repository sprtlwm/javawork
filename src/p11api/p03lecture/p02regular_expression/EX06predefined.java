package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class EX06predefined {
	public static void main(String[] args) {
		String p1 = "[0-9]";
		
		System.out.println(Pattern.matches(p1, "0"));
		System.out.println(Pattern.matches(p1, "9"));
		
		System.out.println("==================");
		
		String p2 = "\\d";
		
		System.out.println(Pattern.matches(p2, "0"));
		System.out.println(Pattern.matches(p2, "9"));
		
		System.out.println("==================");
		
		String p3 = "[^0-9]";
		System.out.println(Pattern.matches(p3, "0"));
		System.out.println(Pattern.matches(p3, "9"));
		
		System.out.println("==================");
		
		String p4 = "\\D";
				
		System.out.println(Pattern.matches(p4, "0"));
		System.out.println(Pattern.matches(p4, "9"));
		
		System.out.println("==================");
		
		String p5 = "[a-zA-Z0-9_]";
		String p6 = "\\w";
		
		
	}
}
