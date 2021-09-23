package p15collection.p03lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EX01 {
	public static void main(String[] args) {
		//map
		//key:value 쌍으로 저장
		
		HashMap<Integer, Integer> map;
		map = new HashMap<>();
		
		//put : key:value 쌍 추가
		
		map.put(100, 300);
		map.put(500, 3000);
		
		//size : map 의 크기
		System.out.println(map.size());
		
		// get : key로 value를 얻기
		Integer v1 = map.get(100);
		System.out.println(v1);
		System.out.println(map.get(500));
		System.out.println(map.get(6000)); // 없는 key는 null 리턴
		
		// put : 이미 있는 key로 value를 추가(덮어쓰기)
		map.put(500, 7000);
		System.out.println(map.get(500));
		
		//keySet : key 집합(set) 리턴
		System.out.println("===key====");
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key);
		}
		
		//전체 key:value 쌍(entry) 탐색
		/*
		 * 1.key set 을 얻고
		 * 2.key로 value를 탐색
		 */
		System.out.println("===탐색===");
		keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key + ":"+ map.get(key));
		}
		
		System.out.println("===탐색2===");
		Set<Map.Entry<Integer, Integer>> entrys = map.entrySet();
		
		for(Map.Entry<Integer, Integer> entry : entrys) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	
		
		
		
	}
}
