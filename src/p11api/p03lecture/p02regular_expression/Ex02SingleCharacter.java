package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex02SingleCharacter {
	public static void main(String[] args) {
		
		String s1 = "\t";
		String p1 = "\t";
		
		System.out.println(s1);
		
		System.out.println(Pattern.matches(p1, s1));//true
		
		String s2 = "\n";
		String p2 = "\n";
		System.out.println(Pattern.matches(p2, s2));//true
		
		String s3 = "\\";
		String p3 = "\\\\";
		System.out.println(s3);// "\"하나만 출력
		System.out.println(Pattern.matches(p3, s3)); //true
				
	}
}
