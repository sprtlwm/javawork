package p15collection.p02quiz.p01list;

public class Ex05 {
	public int sum(String str) {
		//str:"3 4"
		//return : 7
		String[] nums = str.split(" ");
		
		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[1]);
		
		return num1 + num2;
	}
}
