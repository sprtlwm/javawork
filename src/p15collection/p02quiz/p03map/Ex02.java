package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex02 {
	public Map<Integer, Integer> put(){
		// map을 만들어서 return
		// 1:2 , 2"4 추가
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(1 , 2);
		map.put(2 , 4);
		
		return map;
	}
}
