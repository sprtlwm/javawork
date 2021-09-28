package p14lambda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList(Arrays.asList(3,4,5,6));
		
		System.out.println(arr1);

	
		arr1.removeIf(a ->(a % 2 == 0));
		
		System.out.println(arr1.toString());
	//------------------------------------\\
		arr1.removeIf(a ->a % 2 == 0);
		
		System.out.println(arr1);
		
		
	}
}
