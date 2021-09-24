package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex12leetcode {
	 public int[] twoSum(int[] nums, int target) {
	        
		 Map<Integer, Integer> map = new HashMap<>();
		 
		 for(int i = 0; i<nums.length; i++) {
			 if(map.containsKey(target-nums[i])) {
				 return new int[] {map.get(target-nums[i]),i};			
				 } 
			 map.put(nums[i],i);		 
		 }
//		 for (int i = 0; i < nums.length; i++) {
//	        	int diff = target - nums[i];
//	        	if (map.containsKey(diff)) {
//	        		return new int[] {map.get(diff), i };
//	        	}
//	        	
//	        	map.put(nums[i], i);
//	        }
		 return null;
	    }
}
