package p14lambda.p03lecture;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex11Comparator {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,6,7,2,4,1);
	
		System.out.println(list);
		
		list.sort((o1,o2) -> o1 - o2);
		System.out.println(list);
		
		list.sort((a,b) -> b-a);
		System.out.println(list);
		
		list.sort((a,b) -> a.compareTo(b));
		System.out.println(list);
		
		List<String> arr = Arrays.asList("java", "apple", "spring", "jsp");
		
		arr.sort((a,b) -> a.compareTo(b));
		System.out.println(arr);
		
		arr.sort((o1, o2) ->o2.compareTo(o1));
		System.out.println(arr);
		
		arr.sort(Comparator.naturalOrder());
		System.out.println(arr);
		
		arr.sort(Comparator.reverseOrder());
		System.out.println(arr);
		
	}
}
