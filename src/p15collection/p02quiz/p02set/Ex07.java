package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex07 {
	public int countOnlyLetter(String str) {
		//한번 만 사용된 문자의 개수
		
		Set<Character> set = new HashSet<>();
		Set<Character> dup = new HashSet<>();
		for( int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if(set.contains(a)) {
				dup.add(a);
			}else {
				set.add(a);
			}
			}
		for(Character a : dup) {
			set.remove(a);
		}
		return set.size();
	}
}
