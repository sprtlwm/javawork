package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex09 {
	public Map<Character, Integer> countCharacter(String str){
		//str 의 문자가 몇번 나오는지 세어서
		// 문자를 key 몇번을 valur로 갖는 map 만들어서 리턴
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
	
		for(int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
		
			if(map.containsKey(c)) {
				Integer v = map.get(c);
				map.put(c, v +1);
			}else {
				map.put(c, 1);
			}
		}
		return map;
	}
}
