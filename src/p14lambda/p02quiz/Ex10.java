package p14lambda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("java", "spring","html", "a","","css"));
		
	list.replaceAll(e -> {
		if(e.length()<=2) {
			return e;
		}
		return e.substring(e.length()-2);
	});		
	// 삼항 연산식
	list.replaceAll(s -> s.length() <= 2 ? s : s.substring(s.length()-2));
		System.out.println(list); //[vg,ng,a, ,ss]
	}
}
