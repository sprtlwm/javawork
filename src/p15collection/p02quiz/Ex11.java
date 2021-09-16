package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.List;

public class Ex11 {
	public ArrayList<Integer> minMax(List<Integer>list){
		
		// 파라미터로 받은 list의 최소값, 최대값을 아이템으로 갖는 ArrayList 리턴
		ArrayList<Integer> result = new ArrayList<>();
		
		int max = list.get(0);
		int min = list.get(0);
		
		for (int item : list) {
			max = Math.max(max, item);
			min = Math.min(min, item);
		}
			result.add(max);
			result.add(min);
		
		return result; 
	}
}
