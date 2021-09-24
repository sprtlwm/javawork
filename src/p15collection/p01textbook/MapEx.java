package p15collection.p01textbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
//		평균, 최고점, 최고점아이디
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> entrys : entry) {
			if(entrys.getValue() > maxScore) {
				name = entrys.getKey();
				maxScore = entrys.getValue();
			}
			totalScore += entrys.getValue();
		}
		int avg = totalScore / map.size();
	
		System.out.println("평균점수:" + avg);
		System.out.println("최고점수:" + maxScore);	
		System.out.println("최고점수를 받은 아이디:" + name);
	}
}
