package p11api.p03lecture.p03object.p03equals;

import java.util.HashSet;
import java.util.Set;

public class Ex03Set {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		System.out.println(set.size());
		
		set.add("java");
		System.out.println(set.size());
		
		set.add("spring");
		System.out.println(set.size());
		
		set.add("java");
		System.out.println(set.size());
	}
}