package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex07AntCharacter {
	public static void main(String[] args) {
		
		String p1 =".";
		//모든 한자리 문자(기호,숫자,공백) 전부 가능
		System.out.println(Pattern.matches(p1, " "));
		System.out.println(Pattern.matches(p1, "0"));
		System.out.println(Pattern.matches(p1, "."));
		
		System.out.println("==================");
		
		String p2 = "\\.";
		// "." 빼고 전부 false
		System.out.println(Pattern.matches(p2, " "));
		System.out.println(Pattern.matches(p2, "0"));
		System.out.println(Pattern.matches(p2, "."));
	}
}
