package p14lambda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex08 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "java", "adc", "amond","spring"));
		
		list.removeIf(a ->a.charAt(0) !='a');
		System.out.println(list);
	}
}	
