package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex08 {
	public int maxLastIndex(List<Integer>list) {
		//list의 최대값이 있는 마지막 인덱스
		int lastindex = 0;
		int max = list.get(0);
		
		for(int i = 1; i<list.size(); i++) {
			if(list.get(i) >= max) {
				max = list.get(i);
				lastindex = i;
			}
		}
		
		return lastindex;
	}
}
