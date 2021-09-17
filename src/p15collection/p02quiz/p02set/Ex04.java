package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {

	public Set<String> dupSet(String[] strings) {
		
		Set<String> set = new HashSet<>();
		Set<String> result = new HashSet<>();
		
		for(String e : strings) {
			if(set.contains(e)) {
				result.add(e);
			}else {
				set.add(e);
			}
		}
		
		return result;
	}

}
