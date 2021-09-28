package p14lambda.p03lecture;

import java.util.HashMap;
import java.util.Map;

public class Ex13MapCompute {

	public Map<Character, Integer> count(String s) {
		
		Map<Character, Integer> res = new HashMap<>();	
		
		for(Character c : s.toCharArray()) {
			res.compute(c,(k ,v) -> v == null ? 1 : v + 1);
		}
		
		return res;
	}
	
}
