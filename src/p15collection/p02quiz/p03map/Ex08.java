package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex08 {
	public void swap(Map<String, String> param) {
		// param size : 2
		// param 키는 "a", "b"
		// param 각 값을 변경(swap)
		
		String bval = param.get("b"); // 변경되기 전 값을 저장
		
		param.put("b", param.get("a")); //변경
		param.put("a", bval); 
		
	}
}
