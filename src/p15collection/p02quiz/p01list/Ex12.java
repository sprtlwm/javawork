package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex12 {
	public boolean mirror(List<Integer>list) {
		//중간 인덱스 기준으로 양쪽의 거울이 데칼코마니처럼 같은지
		
		int l =0;
		int r = list.size()-1;
		
		while(l < r) {
			
			int lvalue = list.get(l);
			int rvalue = list.get(r);
			
			if(lvalue ==  rvalue) {
				l++;
				r--;
			}else {		
				return false;				
			}
		}
		return true;
	}
	
	public <T>boolean mirror2(List<T>list){
		
		int left = 0;
		int right = list.size() - 1;
		
		while (left < right) {
			T leftValue = list.get(left);
			T rightValue = list.get(right);
			
			if (leftValue.equals(rightValue)) {
				left++;
				right--;
			} else {
				return false;
			}
		}
		
		return true;
		
	}
}
