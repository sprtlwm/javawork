package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex06 {
	 public void doubling(Map<Integer, Integer>map) {
		 //파라미터 map의 값(value)을 2배로
		 
		 Set<Integer> keys = map.keySet();
		 for(Integer key : keys) {
			 Integer val = map.get(key);
			 map.put(key, val*2);

//			map.put(key, map.get(key)*2);			 
		 }		 
	 }
}
