package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex07 {
	public Map<String, String> swap(Map<String, String> param){
		// 파라미터의 사이즈가2
		// 파라미터의 키는 "a", "b"
		// 두 밸류를 서로 바꾼 map을 만들어서 리턴
		// 파라미터 변경X
		
		Map<String, String> map = new HashMap<>();
		
		map.put("b", param.get("a"));
		map.put("a", param.get("b"));
		
		return map;
	}	
}
