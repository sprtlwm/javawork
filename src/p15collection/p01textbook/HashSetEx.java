package p15collection.p01textbook;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("jdbc");
		set.add("servlst/jsp");
		set.add("java");
		set.add("ibatis");
		
		int size = set.size();
		
		System.out.println("총객체수:" + size);
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String ele = iterator.next();
			System.out.println("\t" + ele);
		}
		
		set.remove("jdbc");
		set.remove("ibatis");
		
		System.out.println("총객체수:" + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String ele = iterator.next();
			System.out.println("\t" + ele);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
			
		}
	}
}
