package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex11programmers {
	public String solution(String[] p, String[] c) {
		//완주하지 못한 선수
		Map<String, Integer> map = new HashMap<>();
			
		// 완주자 목록 작성
		for (String name : c) {
			if (map.containsKey(name)) {
				map.put(name, map.get(name) + 1);
			} else {
				map.put(name, 1);
			}
		}

//		System.out.println(map);
		
		// 참가자 확인
		for (String name : p) {
			if (!map.containsKey(name)) {
				return name;
			} else {
				if (map.get(name) == 0) {
					return name;
				}
				map.put(name, map.get(name) - 1);
			}
		}
		
		return null;
	}
}
