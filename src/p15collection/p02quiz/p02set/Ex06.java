package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex06 {

	public int dupLetter(String str) {
		// 몇 개의 문자가 중복사용되었는지?
		
		Set<Character> set = new HashSet<>();
		Set<Character> result = new HashSet<>();
		
		for(int i = 0; i <str.length(); i++) {
		char a = str.charAt(i);
		if(set.contains(a)) {
			result.add(a);
		}else {
			set.add(a);
		}
	  }
	return result.size();
   }
}
