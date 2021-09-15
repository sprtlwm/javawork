package p15collection.p03lecture.p01list;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("spring");
		list.add("js");
	
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.add("boot");
		list.add("list");
		
		System.out.println(list.size());
		
		for(String str : list) {
			System.out.println(str);
		}
		
		list.forEach(str -> System.out.println(str));
		
		System.out.println(list);
		
	
		
	}
}
